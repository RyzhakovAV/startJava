package com.startjava.lesson_2_and_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean yes = true;
		String question;
		String playerNameOne;
		String playerNameTwo;
		int randomStep;
		
		
		System.out.print("Введите имя игрока: ");
		playerNameOne = console.next();
		System.out.print("Введите имя второго игрока: ");
		playerNameTwo = console.next();
		
		if(playerNameOne.equals(playerNameTwo)) {
			playerNameOne = playerNameOne + " 1";
			playerNameTwo = playerNameTwo + " 2";
		}
		
		Player playerOne = new Player(playerNameOne);
		Player playerTwo = new Player(playerNameTwo);
			
		
		while(yes) {
			GuessNumber AI = new GuessNumber();
			randomStep = (int)(Math.random() * 2 + 1);
			System.out.println("Компьютер загадал число. Игра началась!");
			if(randomStep == 1) {
				AI.startGame(1, playerNameOne, playerNameTwo);
			}else{
				AI.startGame(2, playerNameOne, playerNameTwo);
			}
			System.out.println("Хотите повторить игру? [yes/no]");
			question = console.next();
			yes = question.equals("no") || question.equals("n") ? false : true;
		}
	}
}