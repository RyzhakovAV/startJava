package com.startjava.lesson_4.calculator;

import java.util.Arrays;

public class Calculator {
    public static double calculate(String[] array) {
        int digitA = Integer.parseInt(array[0]);
        int digitB = Integer.parseInt(array[2]);

        switch (array[1]) {
            case("+"):
                return digitA + digitB;
            case("-"):
                return digitA - digitB;
            case("*"):
                return digitA * digitB;
            case("^"):
                return Math.pow(digitA, digitB);
            case("/"):
                return (double) digitA / digitB;
        }
        return -1111;
    }
}
