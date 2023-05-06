public class Wolf {
	private char gender;
	private String nickname;
	private float weight;
	private int age;
	private String color;
	private static int id = 0;
		
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname.isEmpty() ? "No name " + id++ : nickname;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setWeight(float weight) {
		if (weight < 0) {
			System.out.println("Вес не может быть отрицательным");
			this.weight = 0f;
		}else{
			this.weight = weight;
		}
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setAge(int age) {
		if(age < 0 || age > 8) {
			System.out.println("Некорректный возраст");
			this.age = 0;
		}else{
		this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setColor(String color) {
		this.color = color.isEmpty() ? "По умолчанию" : color;
	}
	
	public String getColor() {
		return color;
	}

	public void move() {
		System.out.println("Идет");
	}
	
	public void sit() {
		System.out.println("Сидит");
	}
	
	public void run() {
		System.out.println("Бежит");
	}
	
	public void howl() {
		System.out.println("Воет");
	}
	
	public void hunter() {
		System.out.println("Охотится");
	}
}