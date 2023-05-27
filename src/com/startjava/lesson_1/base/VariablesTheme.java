package com.startjava.lesson_1.base;
/* TODO:
Создайте класс VariablesTheme с методом main
Все задания реализуйте в нем, отделяя их друг от друга пустой строкой
Код любой задачи должен начинаться с вывода на консоль ее названия, включая порядковый номер
Отделяйте в консоли вывод одной программы от другой пустой строкой, чтобы текст не сливался
Не используйте ввод с клавиатуры
Все переменные должны быть локальными
*/
public class VariablesTheme {
    public static void main(String[] args) {
        //Task 1 объявите переменные всех существующих в Java примитивных типов данных
        byte totalCore = 4;
        short frequency = 3300;
        int gpu = 1050;
        long totalMemoryGpu = 4095L;
        float partion = 1154.5F;
        double batery = 99.13;
        char procent = '%';
        boolean mobile = true;
        String name = "Dell Inspiron 7577";

        System.out.println("Task №1");
        System.out.println("Model: " + name);
        System.out.println("Laptop: " + mobile);
        System.out.println("Total Cores: " + totalCore);
        System.out.println("Frequency CPU: " + frequency);
        System.out.println("Model GPU: " + gpu);
        System.out.println("Total memory GPU: " + totalMemoryGpu);
        System.out.println("Memory partion: " + partion);
        System.out.println("batery: " + batery + procent);

        System.out.println("\n----------------------");

        //Task 2 Расчет стоимости товара со скидкой
        int pen = 100;
        int book = 200;
        int discount = 11;

        System.out.println("\nTask №2");
        System.out.println("Общая стоимость товаров без скидки: " + (pen + book));

        float discountSum = (pen + book) * (11 / 100.0F);

        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой: " + (pen + book - discountSum));

        System.out.println("\n----------------------");

        //Task 3 Вывод слова JAVA
        System.out.println("\nTask №3");
        System.out.println("   J     a  V     V  a");
        System.out.println("   J    a a  V   V  a a");
        System.out.println("J  J   aaaaa  V V  aaaaa");
        System.out.println(" JJ   a     a  V  a     a");

        System.out.println("\n----------------------");

        //Task 4 Вывод min и max значений целых числовых типов
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("\nTask №4");
        System.out.println("Max byte: " + maxByte);
        System.out.println("Инкремент: " + maxByte++);
        System.out.println("Декремент: " + maxByte--);
        System.out.println("Max short: " + maxShort);
        System.out.println("Инкремент: " + maxShort++);
        System.out.println("Декремент: " + maxShort--);
        System.out.println("Max int: " + maxInt);
        System.out.println("Инкремент: " + maxInt++);
        System.out.println("Декремент: " + maxInt--);
        System.out.println("Max long: " + maxLong);
        System.out.println("Инкремент: " + maxLong++);
        System.out.println("Декремент: " + maxLong--);

        System.out.println("\n----------------------");

        //Task 5 Перестановка значений переменных
        System.out.println("\nTask №5");
        int digit1 = 2;
        int digit2 = 5;
        System.out.println("Digit 1 = " + digit1);
        System.out.println("Digit 2 = " + digit2);
        int timeDigit = digit1;
        digit1 = digit2;
        digit2 = timeDigit;
        System.out.println("Перестановка с помощью третьей переменной: Digit 1 = " + digit1 +
                ", Digit 2 = " + digit2);
        digit1 = 2;
        digit2 = 5;
        digit1 = digit1 + digit2;
        digit2 = digit1 - digit2;
        digit1 = digit1 - digit2;
        System.out.println("Перестановка с помощью арифметических операций: Digit 1 = " + digit1 +
                ", Digit 2 = " + digit2);
        digit1 = 2; // 010
        digit2 = 5; // 101
        digit1 ^= 7;
        digit2 ^= 7;
        System.out.println("Перестановка с помощью арифметических операций: Digit 1 = " + digit1 +
                ", Digit 2 = " + digit2);

        System.out.println("\n----------------------");

        //Task 6 Вывод символов и их кодов
        System.out.println("\nTask №6");
        char code35 = '#';
        char code38 = '&';
        char code64 = '@';
        char code94 = '^';
        char code95 = '_';

        System.out.println(code35 + " = " + (int) code35);
        System.out.println(code38 + " = " + (int) code38);
        System.out.println(code64 + " = " + (int) code64);
        System.out.println(code94 + " = " + (int) code94);
        System.out.println(code95 + " = " + (int) code95);

        System.out.println("\n----------------------");

        //Task 7 Вывод в консоль ASCII-арт Дюка
        System.out.println("\nTask №7");
        char code47 = '/';
        char code92 = '\\';
        char code95t7 = '_';
        char code40 = '(';
        char code41 = ')';

        System.out.println("    " + code47 + code92 + "    ");
        System.out.println("   " + code47 + "  " + code92 + "   ");
        System.out.println("  " + code47 + code95t7 + code40 + " " + code41 + code92 + "  ");
        System.out.println(" " + code47 + "      " + code92 + " ");
        System.out.println("" + code47 + code95t7 + code95t7 + code95t7 + code95t7 + code47 +
                code92 + code95t7 + code95t7 + code92);

        System.out.println("\n----------------------");

        //Task 8 Вывод количества сотен, десятков и единиц числа
        System.out.println("\nTask №8");
        int startNumber = 123;
        System.out.println("Число " + startNumber + " содержит: ");
        int hundred = startNumber / 100;
        System.out.println(hundred + " сотен");
        int ten = (startNumber / 10 ) % 10;
        System.out.println(ten + " десяток");
        int digit = (startNumber % 100) % 10;
        System.out.println(digit + " единиц");
        System.out.println("Сумма его цифр = " + (hundred + ten + digit));
        System.out.println("Произведение его цифр = " + (hundred * ten * digit));

        System.out.println("\n----------------------");

        //Task 9 Вывод времени
        System.out.println("\nTask №9");
        int time = 86399;
        int hour = time / 3600;
        int minute = (time - hour * 3600) / 60;
        int second = time - (hour * 3600) - (minute * 60);
        System.out.println(hour + " : " + minute + " : " + second);
    }
}