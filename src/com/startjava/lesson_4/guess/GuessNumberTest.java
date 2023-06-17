package com.startjava.lesson_4.guess;

import java.util.Scanner;
public class GuessNumberTest {
    static final int size = 10;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstPlayer;
        String secondPlayer;
        String question = "yes";

        System.out.println("Компьютер загадал число от 1 до 100. Вам нужно его угадать.");
        System.out.println("У каждого игрока " + size + " попыток.");
        System.out.print("Введите имя первого игрока: ");
        firstPlayer = console.next();
        System.out.print("Введите имя второго игрока: ");
        secondPlayer = console.next();
        if (firstPlayer.equals(secondPlayer)) {
            secondPlayer = secondPlayer + " 2";
        }

        while(!question.equals("no")) {
            GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
            System.out.println("\nИгра окончена, если хотите завершить программу наберите 'no'");
            question = console.next();
        }
    }

}
