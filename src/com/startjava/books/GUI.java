package com.startjava.books;

import java.util.Scanner;

public final class GUI {
    private static Scanner input = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("В шкафу Х книг и свободно Х полок");
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
    public static int selectMenu(int point) {
        switch (point) {
            case 1:
                    System.out.println("Выбран пункт добавить книгу. Введите автора книги");
                    System.out.println("1. Назад");
                    String autor = input.next();
                    if (autor.equals("1")) return 0;
                    else if (autor.isEmpty()) autor = "unknow";
                    System.out.println("Введите название книги");
                    String title = input.next();
                    if(title.isEmpty()) title = "unknow";
                    System.out.println("Введите год");
                    int year = input.nextInt();
                    System.out.println("1. Сохранить");
                    System.out.println("2. Отмена");
                    int save = input.nextInt();
                    if (save == 1) {
                        return 1;
                    }else if(save ==2){
                        return 0;
                    }else{
                        System.out.println("Ошибка ввода");
                        return 0;
                    }
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return -1;
        }
    }



}
