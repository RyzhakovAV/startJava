import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean yes = true;
		String question;
		Calculator calc = new Calculator();
		
		
		while(yes) {
			System.out.print("Введите первое число: ");
			String a = console.next();
			calc.setA(a);
			System.out.print("Введите знак математическoй операции (+, -, *, /, ^, %): ");
			String operation = console.next();
			calc.setOperation(operation);
			System.out.print("Введите второе число: ");
			String b = console.next();
			calc.setB(b);
			
			System.out.println("Хотите продолжить вычисления? [yes/no]: ");
			question = console.next();
			yes = question.equals("no") ? false : true;
		}
	}
}