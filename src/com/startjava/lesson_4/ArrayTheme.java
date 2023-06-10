package com.startjava.lesson_4;

import java.util.Arrays;
import java.util.Random;

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

    public static void CharArray() {
        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");
        char[] arrayChar = new char[26];
        char Z = 90;
        for(int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = Z;
            Z--;
        }
        printArray(arrayChar);
    }

    public static void generateRandomNumbers(int start, int finish) {
        System.out.println("5. Генерация уникальных чисел");
        int size = finish - start;
        int[] arrayRandomNumbers = new int[size];
        for(int i = 0; i < arrayRandomNumbers.length; i++) {
            arrayRandomNumbers[i] = start++;
        }
        mixArray(arrayRandomNumbers);
        printArray(arrayRandomNumbers);
    }

    public static void copyArray() {
        System.out.println("6. Копирование не пустых строк");
        int count = 0;
        String[] firstArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        for(String line : firstArray) {
            int index = -1;
            System.out.print(line + " ");
            if (line.isEmpty()) {
                count++;
            }else{
                index = line.indexOf(" ");
                if(index > -1) {
                    count++;
                }
            }
        }
        if(count == firstArray.length) {
            System.out.println("Все строки пустые");
        }else {
            System.out.println();
            String[] secondArray = new String[firstArray.length - count];
            int start = 0;
            int index;
            int position = 0;
            for (int i = 0; i < firstArray.length; i++) {
                index = -1;
                index = firstArray[i].indexOf(" ");
                if(!firstArray[i].isEmpty() && index != 0) {
                    secondArray[position] = firstArray[i];
                    position++;
                }
            }
            for(String line : secondArray) {
                System.out.print(line + ",");
            }
        }

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
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                System.out.print("[" + array[i] + ", ");
            }else if(i == array.length - 1) {
                System.out.print(array[i] + "] ");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
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

    public static void printArray(char[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }

    public static void mixArray(int[] array) {
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {1, 5, 3, 2, 6, 7, 4};
        reverseArray(arrayNumbers);
        System.out.println();
        multiArray();
        System.out.println();
        deleteElementsInArray();
        System.out.println();
        CharArray();
        System.out.println();
        generateRandomNumbers(60, 100);
        System.out.println();
        copyArray();
    }
}
