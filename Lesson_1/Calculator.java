import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		String number1 = console.nextLine();
		
		System.out.print("Введите математическое действие (+, -, *, /, ^, %): ");
		String operation = console.nextLine();
		
		System.out.print("Введите число: ");
		String number2 = console.nextLine();
		
		if(operation.equals("+")) {
			try {
				int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
				System.out.println(number1 + " " + operation + " " + number2 + " = " + sum);
			} catch (Exception e) {
				System.out.println("Ошибка ввода");
			}
		}else if(operation.equals("-")) {
			try {
				int dif = Integer.parseInt(number1) - Integer.parseInt(number2);
				System.out.println(number1 + " " + operation + " " + number2 + " = " + dif);
			} catch (Exception e) {
				System.out.println("Ошибка ввода");
			}
		}else if(operation.equals("*")) {
			try {
				int mul = Integer.parseInt(number1) * Integer.parseInt(number2);
				System.out.println(number1 + " " + operation + " " + number2 + " = " + mul);
			} catch (Exception e) {
				System.out.println("Ошибка ввода");
			}
		}else if(operation.equals("/")) {
			try {
				float div = Float.parseFloat(number1) / Float.parseFloat(number2);
				System.out.println(number1 + " " + operation + " " + number2 + " = " + div);
			} catch (Exception e) {
				System.out.println("Ошибка ввода");
			}
		}else if(operation.equals("^")) {
			try {
				int pow = (int)(Math.pow(Integer.parseInt(number1), Integer.parseInt(number2)));
				System.out.println(number1 + " " + operation + " " + number2 + " = " + pow);
			} catch (Exception e) {
				System.out.println("Ошибка ввода");
			}
		}else if(operation.equals("%")) {
			try {
				int divOst = Integer.parseInt(number1) % Integer.parseInt(number2);
				System.out.println(number1 + " " + operation + " " + number2 + " = " + divOst);
			} catch (Exception e) {
				System.out.println("Ошибка ввода");
			}
		}else {
			System.out.println("Ошибка выбора математической операции");
		}
	}
	
}