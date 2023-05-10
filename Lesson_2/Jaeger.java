public class Jaeger {
		//Technical Information
	private String name;
	private String mark;
	private String status;
	private String origin;
		//Jaeger Specifications
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;
	
	public void Jaeger() {
	}
	
	public void Jaeger(String name, String mark, float height, float weight, int speed, int strength, int armor) {
		this.name = name;
		this.mark = mark;
		status = "UNKNOW";
		origin = "UNKNOW";
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}
	
	public void Jaeger(String name, String mark, String status, String origin, float height, float weight, int speed, int strength, int armor) {
		this.name = name;
		this.mark = mark;
		this.status = status;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public String getMark() {
		return mark;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public int getArmor() {
		return armor;
	}
}