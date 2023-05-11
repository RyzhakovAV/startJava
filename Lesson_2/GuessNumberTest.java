import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean yes = true;
		String question;
		String playerNameOne;
		String playerNameTwo;
		int randomStep = (int)(Math.random() * 2 + 1);
		
		
		System.out.print("Введите имя игрока: ");
		playerNameOne = console.next();
		System.out.print("Введите имя второго игрока: ");
		playerNameTwo = console.next();
		
		Player playerOne = new Player(playerNameOne);
		Player playerTwo = new Player(playerNameTwo);
		
		while(yes) {
			GuessNumber AI = new GuessNumber();
			System.out.println("Компьютер загадал число. Игра началась!");
			if(randomStep == 1) {
				System.out/println("Ход первого игрока");
			}else{
				System.out.println("Ход второго игрока");
			}
			System.out.println(AI.getNumber());
			System.out.println("Хотите повторить игру? [yes/no]");
			question = console.next();
			yes = question.equals("no") || question.equals("n") ? false : true;
		}
	}
}