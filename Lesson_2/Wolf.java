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
		id++;
		this.nickname = nickname.isEmpty() ? "No name " + id : nickname;
	}
	
	public String getNickname() {
		return nickname;
	}
	/*
	public setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	*/
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