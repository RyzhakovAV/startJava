package com.startjava.lesson_4.guess;

import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String question = "yes";

        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(console.next());

        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(console.next());
        int random = (int)(1 + Math.random() * 100);
        GuessNumber number = new GuessNumber(random, firstPlayer.getName(), secondPlayer.getName());
        System.out.println(random);
        while(!question.equals("no")) {
            int step = (int)(Math.random() * 2);
            System.out.println("Игра началась. У каждого игрока по " + Player.getSizeArray() + " ходов");
            System.out.println("Вам нужно угадать какое число загадал компьютер от 1 до 100");
            while(number.getStep()) {
                if (step == 0) {
                    System.out.println("Ход игрока " + firstPlayer.getName());
                    number.setStepPlayer(step);
                } else {
                    System.out.println("Ход игрока " + secondPlayer.getName());
                    number.setStepPlayer(step);
                }
            }
            System.out.print("Хотите продолжить игру? Если нет, введите no");
            question = console.next();
        }
    }
}
