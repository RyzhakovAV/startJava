package com.startjava.lesson_4;

public class ArrayTheme {
    public static void reverseArray(int[] array) {
        System.out.println("1. Реверс значений массива");
        printArray(array);
        reverse(array);
        System.out.println();
    }

    public static void multiArray() {
        System.out.println("2. Вывод произведения элементов массива");
        int[] multiArr = fillArray(10);
        printArray(multiArr);
        int R = 1;
        for(int i = 0; i < multiArr.length; i++) {
            if(multiArr[i] != 0 && multiArr[i] != 9) {
                R *= multiArr[i];
            }
        }
        System.out.println();
        System.out.println(R > 1 ? "Произведение числе в массиве равно: " + R : " 1");
    }

    public static int[] fillArray(int size) {
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void reverse(int[] array) {
        int[] copyArray = new int[array.length];
        for(int i = 0; i < array.length; i ++) {
            int max = array[i];
            for(int j = 1 + i; j < array.length; j++) {
                if(max < array[j]) {
                    int time = array[j];
                    array[j] = max;
                    max = time;
                }
            }
            copyArray[i] = max;
        }
        printArray(copyArray);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for(int number: array) {
            System.out.print(number + ", ");
        }
        System.out.print("] ");
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {1, 5, 3, 2, 6, 7, 4};
        reverseArray(arrayNumbers);
        System.out.println();
        multiArray();
    }
}
