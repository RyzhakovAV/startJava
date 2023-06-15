package com.startjava.lesson_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private String firstName;
    private String secondName;
    private String time;
    private Scanner console = new Scanner(System.in);

    public GuessNumber(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        startGame();
    }

    Player firstPlayer = new Player(firstName);
    Player secondPlayer = new Player(secondName);

    private void startGame() {

        int AI = (int)(1 + Math.random() * 100);
        int random = (int)(1 + Math.random() * 2);
        if(random == 1) {
            System.out.println("Ход игрока " + firstName);
            game(AI, firstName, secondName);
        }else {
            System.out.println("Ход игрока " + secondName);
            game(AI, secondName, firstName);
        }
    }

    private void inputArray(String name, int number) {
        if(firstPlayer.getNamePlayer().equals(name)) {
            firstPlayer.setArrayPlayer(number);
        }else{
            secondPlayer.setArrayPlayer(number);
        }
    }

    public void printArray() {
        for(int number : firstPlayer.arrayPlayer) {
            System.out.print(number + " ");
        }
        for(int number : secondPlayer.arrayPlayer) {
            System.out.print(number + " ");
        }
    }

    private void game(int number, String playerOne, String playerTwo) {
        boolean cicle = true;
        while (cicle) {
            try {
                System.out.print(playerOne + ". Введите число ");
                int input = console.nextInt();
                if (number < input && input <= 100) {
                    System.out.println("Ваше число больше загаданного");
                    //inputArray(playerOne, input);
                } else if (number > input && input >= 1) {
                    System.out.println("Ваше число меньше загаданного");
                    //inputArray(playerOne, input);
                } else if (number == input) {
                    System.out.println("Вы угадали число. Это " + number);
                    System.out.println("Победил игрок " + playerOne + ". Поздравляю!");
                    //inputArray(playerOne, input);
                    //printArray();
                    cicle = false;
                    break;
                } else if (input < 1 || input > 100){
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Должно быть число от 1 до 100");
                game(number, playerOne, playerTwo);
            }
            time = playerOne;
            playerOne = playerTwo;
            playerTwo = time;
        }


    }


}
