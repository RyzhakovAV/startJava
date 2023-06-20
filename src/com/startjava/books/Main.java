package com.startjava.books;


import java.util.Scanner;

import static com.startjava.books.GUI.*;
public class Main {
    public static void main(String[] args) {
        boolean menu = true;
        Scanner console = new Scanner(System.in);

        while (menu) {
            printMenu();
            System.out.println("Выберите пункт и подвердите нажатием Enter");
            String choice = console.next();
            try {
                int choisePoint = selectMenu(Integer.parseInt(choice));
                if(choisePoint == -1) {
                    System.out.println("Ошибка ввода, попробуйте еще раз");
                }else if(choisePoint == 8) {
                    menu = false;
                }else if(choisePoint == 0) continue;
            } catch(Exception e) {
                System.out.println("Ошибка ввода, попробуйте еще раз");
            }
        }
    }
}
