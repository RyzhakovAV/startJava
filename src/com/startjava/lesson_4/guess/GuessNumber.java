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
            firstPlayer.setNamePlayer(firstName);
            secondPlayer.setNamePlayer(secondName);
            game(AI, firstName, secondName);
        }else {
            System.out.println("Ход игрока " + secondName);
            firstPlayer.setNamePlayer(firstName);
            secondPlayer.setNamePlayer(secondName);
            game(AI, secondName, firstName);
        }

    }

    public void inputArray(String name, int number) {
        if(firstPlayer.getNamePlayer().equals(name)) {
            try {
                firstPlayer.setArrayPlayer(number);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(firstPlayer.getNamePlayer() + " у вас кончились попытки");
            }
        }else {
            try {
                secondPlayer.setArrayPlayer(number);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(secondPlayer.getNamePlayer() + " у вас кончились попытки");
            }
        }
    }

    public void printArray(String name) {
        System.out.println("Набранный набор победителя");
        System.out.println();
        if (firstPlayer.getNamePlayer().equals(name)) {
            for(int i = 0 ; i < firstPlayer.count; i++) {
                System.out.print(firstPlayer.arrayPlayer[i] + " ");
            }
            System.out.println("\nИгрок " + firstPlayer.getNamePlayer() + " угадал число " + firstPlayer.arrayPlayer[firstPlayer.count - 1] + " с " + firstPlayer.count + " попытки");
        } else {
            for(int i = 0 ; i < secondPlayer.count; i++) {
                System.out.print(secondPlayer.arrayPlayer[i] + " ");
            }
            System.out.println("\nИгрок " + secondPlayer.getNamePlayer() + " угадал число " + secondPlayer.arrayPlayer[secondPlayer.count - 1] + " с " + secondPlayer.count + " попытки");

        }
    }

    private void game(int number, String playerOne, String playerTwo) {

        boolean cicle = true;
        while (cicle) {
            if (secondPlayer.count != 10 || firstPlayer.count != 10) {
                try {
                    System.out.print("\n" + playerOne + ". Введите число ");
                    int input = console.nextInt();
                    if (number < input && input <= 100) {
                        System.out.println("Ваше число больше загаданного");
                        inputArray(playerOne, input);
                    } else if (number > input && input >= 1) {
                        System.out.println("Ваше число меньше загаданного");
                        inputArray(playerOne, input);
                    } else if (number == input) {
                        System.out.println("Вы угадали число. Это " + number);
                        inputArray(playerOne, input);
                        printArray(playerOne);
                        cicle = false;
                        break;
                    } else if (input < 1 || input > 100) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка ввода. Должно быть число от 1 до 100");
                    game(number, playerOne, playerTwo);
                }
                time = playerOne;
                playerOne = playerTwo;
                playerTwo = time;
            }else {
                System.out.println("У " + firstPlayer.getNamePlayer() + " закончились попытки");
                System.out.println("У " + secondPlayer.getNamePlayer() + " закончились попытки");
                System.out.println("Игра окончена. Число которое загадал компьютер " + number);
                System.out.print("\n" + firstPlayer.getNamePlayer() + "\t : \t");
                for (int i = 0; i < firstPlayer.count; i++) {
                    System.out.print(firstPlayer.arrayPlayer[i] + " ");
                }
                System.out.print("\n" + secondPlayer.getNamePlayer() + "\t : \t");
                for (int i = 0; i < secondPlayer.count; i++) {
                    System.out.print(secondPlayer.arrayPlayer[i] + " ");
                }
                cicle = false;
                break;
            }
        }


    }


}
