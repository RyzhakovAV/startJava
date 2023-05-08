public class Calculator {
	private String a;
	private String b;	
	private String operation;
	private double numberA;
	private double numberB;

	
	public void setA(String a) {
		this.a = a;
	}
	
	public void setB(String b) {
		this.b = b;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void Convert() {
		try {
			this.numberA = Double.parseDouble(a);
			this.numberB = Double.parseDouble(b);
			if(Equals(this.numberA, this.numberB, operation) == -1) {
				System.out.println("Ошибка ввода математической операции");
			}else {
				System.out.printf("%s %s %s = %.2f \n",a, operation, b, Equals(numberA, numberB, operation));
			}
		}catch(Exception e) {
			System.out.println("Ошибка ввода числовых значений");
		}
	}
	
	private double Equals(double numberA, double numberB, String operation) {
		switch(operation) {
			case "+":
				return numberA + numberB;
			case "-":
				return numberA - numberB;
			case "*":
				return numberA * numberB;
			case "/":
				return numberA / numberB;
			case "^":
				return Math.pow(numberA, numberB);
			case "%":
				return numberA % numberB;
			default:
				System.out.println();
				return -1;
		}
	}
	
}