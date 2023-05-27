package com.startjava.lesson_2_and_3.robot;

public class Jaeger {
	private static int enemy;
	private static int finalHit;
		//Technical Information
	private String name;
	private String mark;
	private String origin;
	private boolean status = true;
		//Jaeger Specifications
	private float height;
	private int weight;
	private int speed;
	private int strength;
	private int armor;
	
	public Jaeger() {
	}
	
	public Jaeger(String name, String mark, float height, int weight, int speed, int strength, int armor) {
		this.name = name;
		this.mark = mark;
		origin = "UNKNOW";
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}
	
	public Jaeger(String name, String mark, String origin, float height, int weight, int speed, int strength, int armor) {
		this.name = name;
		this.mark = mark;
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
	
	public boolean getStatus() {
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
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
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
	
	public String start() {
		if(status) {
			return "Робот активирован";
		}else {
			return "Робот уничтожен";
		}
	}
	
	public String go() {
		if(status) {
			return "Робот вышел на марширут";
		}else {
			return "Робот уничтожен";
		}
	}
	
	public String goHome() {
		return "Робот завершил потрулирование и направлен в ангар";
	}
	
	public void scanner() {
		for(int i = 0; i <= 5; i++) {
			if(status) {
				System.out.println("Произвожу сканирование");
				enemy = (int)(Math.random() * 2);
				if(enemy == 1) {
					System.out.println("Обнаружен враг!!!");
					System.out.println("Вступаю в бой");
					finalHit = (int)(Math.random() * 15);
					if(finalHit > armor) {
						status = false;
						System.out.println("Робот потерпел поражение");
					}else{
						System.out.println("Враг повержен");
					}
				}else{
					System.out.println("Враг не обнаружен");
					if (i == 5) System.out.println(goHome());
				}
			}else{
			System.out.println("Робот уничтожен");
			break;
			}
		}
	}
}