package com.startjava.lesson_2_and_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger cherno = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2412, 3, 10, 10);
		Jaeger gipsy = new Jaeger();
		
		gipsy.setName("Gipsy Danger");
		gipsy.setMark("Mark-3");
		gipsy.setOrigin("United States of America");
		gipsy.setHeight(79.25f);
		gipsy.setWeight(1980);
		gipsy.setSpeed(7);
		gipsy.setStrength(8);
		gipsy.setArmor(6);
		
		System.out.println(gipsy.getName() + ": " + gipsy.start());
		System.out.println(gipsy.getName() + ": " + gipsy.go());
		gipsy.scanner();
		
		System.out.println(cherno.getName() + ": " + cherno.start());
		System.out.println(cherno.getName() + ": " + cherno.go());
		cherno.scanner();
	}
}