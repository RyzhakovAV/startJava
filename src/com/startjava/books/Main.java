package com.startjava.books;


import java.util.Scanner;

import static com.startjava.books.GUI.*;
public class Main {
    static Closet closet1 = new Closet();
    public static void main(String[] args) {
        boolean menu = true;
        Scanner console = new Scanner(System.in);

        System.out.println("Шкаф пуст вы можете в него добавить первую книну");
        while (menu) {
            printMenu();
            System.out.println("Выберите пункт и подвердите нажатием Enter");
            String choice = console.next();
            try {
                int choisePoint = selectMenu(Integer.parseInt(choice));
                if (choisePoint == -1) {
                    System.out.println("Ошибка ввода, попробуйте еще раз");
                } else if (choisePoint == 8) {
                    menu = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода, попробуйте еще раз");
            }
        }
    }
}
