import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String playerNameOne;
		String playerNameTwo;
		int randomStep = (int)(Math.random() * 2 + 1);
		
		
		System.out.print("Введите имя игрока: ");
		playerNameOne = console.next();
		System.out.print("Введите имя второго игрока: ");
		playerNameTwo = console.next();
		
		Player playerOne = new Player(playerNameOne);
		Player playerTwo = new Player(playerNameTwo);
		
		
		GuessNumber AI = new GuessNumber();
		System.out.println("Компьютер загадал число. Игра началась!");
		
		
		System.out.println(AI.getNumber());
		
		
	}
}