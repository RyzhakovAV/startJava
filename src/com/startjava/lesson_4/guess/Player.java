package com.startjava.lesson_4.guess;

public class Player {
    private String name;
    private static final int sizeArray = 10;
    private int size = sizeArray;
    private int[] numbers = new int[sizeArray];
    private int count = 1;


    public Player(String name) {
        this.name = name;
    }

    public void addArray() {

    }
    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return sizeArray;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int getSizeArray() {
        return sizeArray;
    }
}
