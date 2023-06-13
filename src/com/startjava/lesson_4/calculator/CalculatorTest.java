package com.startjava.lesson_4.calculator;

import java.util.Scanner;

import static com.startjava.lesson_4.calculator.Calculator.calculate;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.print("Введите математический пример: ");
        Scanner console = new Scanner(System.in);
        //Calculator calc = new Calculator();
        String inputConsole = console.nextLine();
        String[] arrayConsole = inputConsole.split(" ");
        try {
            System.out.printf(calculate(arrayConsole) - (int) calculate(arrayConsole) == .000 ?
                    inputConsole + " = " + (int) calculate(arrayConsole):
                    inputConsole + " = %.3f", calculate(arrayConsole));
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Повторите попытку!");
        }
    }
}
