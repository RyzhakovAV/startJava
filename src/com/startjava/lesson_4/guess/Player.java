package com.startjava.lesson_4.guess;

public class Player {
    int[] arrayPlayer = new int[GuessNumberTest.size];
    String namePlayer;
    int count = 0;

    public Player(String name) {
        namePlayer = name;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setArrayPlayer(int number) {
        arrayPlayer[count] = number;
        count++;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
