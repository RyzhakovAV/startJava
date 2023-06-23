package com.startjava.books;

import java.util.Arrays;
import java.util.Scanner;

public final class GUI {
    //private static

    public static void printMenu() {
        System.out.printf("\nВ шкафу %d книг и свободно %d полок\n", Closet.getCountBooks(), Closet.getSizeCloset() - Closet.getCountBooks());
        System.out.println();
        System.out.println("1. Добавить книгу");
        System.out.println("2. Найти книгу");
        System.out.println("3. Удалить книгу");
        System.out.println("4. Показать все книги");
        System.out.println("5. Показать количество книг в шкафу");
        System.out.println("6. Показать количество свободных полок");
        System.out.println("7. Очистить шкаф");
        System.out.println("8. Завершить");
    }

    public static void printBooks(Closet[] array, int number) {
        for(int i = 0; i < number; i++) {
            System.out.println(array[i]);
        }
    }

    public static void line(int number) {
        for (int i = 0; i <= number + 5; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printCloset(Closet[] array, int number) {
        int bigString = 0;
        for (int i = 0; i < number; i++) {
            Book book = (Book)array[i];
            int len = book.getLength();
            if(bigString < len) {
                bigString = len;
            }
        }
        for (int i = 0; i < number; i++) {
            Book book = (Book)array[i];
            line(bigString);
            System.out.print("|");
            System.out.print(array[i]);
            for(int j = 0; j < bigString - book.getLength(); j++) {
                System.out.print(" ");
            }
            System.out.print("|\n");
        }
        line(bigString);
    }

    public static void findBook(Closet[] array, int number, String Bookname) {
        for(int i = 0; i < number; i++) {
            Book book = (Book)array[i];
            if(Bookname.equals(book.getTitle())) {
                System.out.println("Книга найдена:");
                System.out.println(book);
            }else {
                if (i == number - 1) {
                    System.out.println("Книга не найдена");
                }
            }
        }
    }

    public static void deleteBook(Closet[] array, int number, String Bookname) {

    }

    public static int selectMenu(int point) {
        Scanner input = new Scanner(System.in);
        switch (point) {
            case 1:
                System.out.println("1. Назад");
                System.out.println("Введите автора книги или выберите пункт 1");
                String autor = input.nextLine();
                if (autor.equals("1")) return 0;
                else if (autor.isEmpty()) autor = "unknow";
                System.out.println("Введите название книги");
                String title = input.nextLine();
                if(title.isEmpty()) title = "unknow";
                System.out.println("Введите год");
                int year = input.nextInt();
                System.out.println("1. Сохранить");
                System.out.println("2. Отмена");
                int save = input.nextInt();
                if (save == 1) {
                    Main.closet1.add(new Book(autor, title, year));
                    printCloset(Main.closet1.arrayCloset, Closet.getCountBooks());
                }else if(save ==2){
                    return 0;
                }else{
                    System.out.println("Ошибка ввода");
                    return 0;
                }
            case 2:
                System.out.println("Введите назване книги");
                String findTitle = input.nextLine();
                findBook(Main.closet1.arrayCloset, Closet.getCountBooks(), findTitle);
                return 2;
            case 3:
                printCloset(Main.closet1.arrayCloset, Closet.getCountBooks());
                return 3;
            case 4:
                printBooks(Main.closet1.arrayCloset, Closet.getCountBooks());
                return 4;
            case 5:
                System.out.printf("Количество книг в шкафу: %d\n", Closet.getCountBooks());
                return 5;
            case 6:
                System.out.printf("Количество сободных полок: %d\n", Closet.getSizeCloset() - Closet.getCountBooks());
                return 6;
            case 7:
                Arrays.fill(Main.closet1.arrayCloset, null);
                Main.closet1.fillArray();
                return 7;
            case 8:
                printCloset(Main.closet1.arrayCloset, Closet.getCountBooks());
                return 8;
            default:
                return -1;
        }
    }



}
