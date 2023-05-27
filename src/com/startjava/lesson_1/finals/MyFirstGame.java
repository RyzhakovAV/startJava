package com.startjava.lesson_1.finals;

import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
	int randomNumber = (int)(Math.random() * 100);	
	Scanner console = new Scanner(System.in);
	System.out.println("Компьютер загадал число. Угадайте число:");
	String inputNumber = console.nextLine();
	Boolean condition = true;
	
	while(condition) {
		try {
			int number = Integer.parseInt(inputNumber);
			if(number < randomNumber) {
				System.out.println("Ваше число меньше загаданного. Введите другое число: ");
			}else if(number > randomNumber) {
				System.out.println("Ваше число больше загаданного. Введите другое число: ");
			}else{
				System.out.println("Вы угадали, это было число: " + randomNumber);
				break;
			}
			inputNumber = console.nextLine();
		} catch(Exception e) {
			System.out.println("Ошибка ввода");
		}
	}
	}
}