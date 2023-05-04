public class Person {
	char gender = 'M';
	String firstName = "Aleksandr";
	String lastName = "Ryzhakov";
	float height = 180.9f;
	float weight = 82.2f;
	int age = 37;
	
	String move() {
		return "Я иду";
	}
	
	String sit() {
		return "Я сижу";
	}
	
	void run() {
		System.out.println("Я бегу");
	}
	
	String speak() {
		return "Привет!";
	}
	
	void study() {
		System.out.println("Как здорово учить Java");
	}
}