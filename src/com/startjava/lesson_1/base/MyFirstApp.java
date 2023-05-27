package com.startjava.lesson_1.base;

public class MyFirstApp {
    public static void main(String[] args) {
        short fishNumber = 3; // три рыбки
        short beefNumber = 2; // два кусочка говядины
        short breakfast = 0;
        breakfast = (short) (fishNumber + beefNumber);
        System.out.print(breakfast);
    }
}