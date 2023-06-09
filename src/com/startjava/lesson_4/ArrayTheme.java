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

    public static void deleteElementsInArray() {
        System.out.println("3. Удаление элементов массива");
        double[] doubleArray = fillArrayDouble(15);
        printArray(doubleArray);
        double mid = doubleArray[doubleArray.length / 2];
        System.out.println("\nЧисло в середине массива = " + mid);
        int count = 0;
        for(int i = 0; i < doubleArray.length; i++) {
            if(i != doubleArray.length / 2) {
                if((mid - doubleArray[i]) < 0.001) {
                    doubleArray[i] = 0;
                    count++;
                }
            }
        }
        printArray(doubleArray);
        System.out.println("\nКоличество обнуленных ячеек = " + count);
    }

    public static int[] fillArray(int size) {
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static double[] fillArrayDouble(int size) {
        double[] array = new double[size];
            for(int i = 0; i < array.length; i++) {
                array[i] = Math.random();
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

    public static void printArray(double[] array) {
        for(int i = 0; i < array.length; i++) {
            if(i ==0 ) {
                System.out.print("[");
                System.out.printf("%.3f, ", array[i]);
            }else if(i == array.length - 1) {
                System.out.printf("%.3f", array[i]);
            }else if(i == array.length / 2 + 1) {
                System.out.printf("\n %.3f, ", array[i]);
            }else{
                System.out.printf("%.3f, ", array[i]);
            }
        }
        System.out.print("] ");
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {1, 5, 3, 2, 6, 7, 4};
        reverseArray(arrayNumbers);
        System.out.println();
        multiArray();
        System.out.println();
        deleteElementsInArray();
    }
}
