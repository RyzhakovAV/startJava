package com.startjava.lesson_2_and_3.guess;

import java.util.Scanner;

public class GuessNumber {
	private int numberRandom;
	private String number;
	private int inputNumber = 0;
	int i = 0;
	String step;
	Scanner input = new Scanner(System.in);
	
	public GuessNumber() {
		numberRandom = (int)(Math.random() * 100 + 1);
	}
	
	public int getNumberRandom() {
		return numberRandom;
	}
	
	public void startGame(int idPlayer, String playerNameOne, String playerNameTwo) {
		if(idPlayer == 1) {
			System.out.println("Ход " + playerNameOne);
			game(playerNameOne, playerNameTwo);
		}else{
			System.out.println("Ход " + playerNameTwo);
			game(playerNameTwo, playerNameOne);
		}
	}
	
	private void game(String one, String two) {
		while(inputNumber < 1 || inputNumber > 100) {
			System.out.println(one + " Введите число от 1 до 100: ");
			number = input.next();
			try {
				inputNumber = Integer.parseInt(number);
			}catch (Exception e) {
				System.out.println("Ошибка ввода попробуйте еще раз " + one);
				continue;
			}
		}
		
		if(inputNumber < numberRandom) {
			System.out.println("Введеное число меньше чем загадал компьютер. Ход " + two);
			i = -1;
		}else if(inputNumber > numberRandom) {
			System.out.println("Введеное число больше чем загадал компьютер. Ход " + two);
			i = -1;
		}else{
			System.out.println(one + " Вы победили!!! Это число: " + numberRandom);
			i = 1;
		}
		
		if(i < 0) {
			step = one;
			one = two;
			two = step;
			inputNumber = 0;
			game(one, two);
			
		}
		
	}
}