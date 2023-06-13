package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.print("Введите математический пример: ");
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        String inputConsole = console.nextLine();
        calc.input(inputConsole);

    }
}
