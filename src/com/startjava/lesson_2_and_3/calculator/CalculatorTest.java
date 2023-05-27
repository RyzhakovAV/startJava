package com.startjava.lesson_2_and_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean yes = true;
		String a;
		String b;
		String operation;
		String question;
		Calculator calc = new Calculator();
		
		
		while(yes) {
			System.out.print("\nВведите первое число: ");
			a = console.next();
			calc.setA(a);
			System.out.print("Введите знак математическoй операции (+, -, *, /, ^, %): ");
			operation = console.next();
			calc.setOperation(operation);
			System.out.print("Введите второе число: ");
			b = console.next();
			calc.setB(b);
			
			calc.Convert();
			
			System.out.println("Хотите продолжить вычисления? [yes/no]: ");
			question = console.next();
			yes = question.equals("no") || question.equals("n") ? false : true;
		}
	}
}