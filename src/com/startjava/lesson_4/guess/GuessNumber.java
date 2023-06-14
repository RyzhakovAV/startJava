package com.startjava.lesson_4.guess;

public class GuessNumber {
    private int guessNumber;
    private String firstName;
    private String secondName;
    private int stepPlayer;
    private boolean step = true;

    public GuessNumber(int number, String firstName, String secondName) {
        this.guessNumber = number;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public boolean getStep() {
        return step;
    }

    public void setStep(boolean step) {
        this.step = step;
    }

    public void setStepPlayer(int step) {
        this.stepPlayer = step;
    }

}
