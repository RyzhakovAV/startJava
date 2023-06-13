package com.startjava.lesson_4.calculator;

import java.util.Scanner;

import static com.startjava.lesson_4.calculator.Calculator.calculate;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.print("Введите математический пример: ");
        Scanner console = new Scanner(System.in);
        String inputConsole = console.nextLine();
        while (!inputConsole.equals("no")) {
            try {
                String[] arrayConsole = inputConsole.split(" ");
                System.out.printf(calculate(arrayConsole) - (int) calculate(arrayConsole) == .000 ?
                        inputConsole + " = " + (int) calculate(arrayConsole) :
                        inputConsole + " = %.3f", calculate(arrayConsole));
                System.out.println("\nНаберите 'no' чтобы выйти из программы. Чтобы продолжить введите математический пример: ");
                inputConsole = console.nextLine();
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Повторите попытку!");
                System.out.println("\nНаберите 'no' чтобы выйти из программы. Чтобы продолжить введите математический пример: ");
                inputConsole = console.nextLine();
            }
        }
    }
}
