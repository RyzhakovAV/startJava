package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Task 1 Перевод псевдокода на язык Java
        System.out.println("Task 1");
        int age = 36;
        char gender = 'M';
        float height = 1.82F;
        String firstName = "Aleksandr";

        if(age > 20) {
            System.out.println("Доступ в клуб открыт");
        } else {
            System.out.println("Вам нельзя к нам. Нужно подрости");
        }
        if(gender != 'M') {
            System.out.println("Вам нужна комната где вы можете попудрить носик с буквой W");
        } else {
            System.out.println("Туалет с буквой M");
        }
        if(height < 1.8) {
            System.out.println("Батскетбол? Будет сложно");
        } else {
            System.out.println("Вам стоит попрбовать батскетбол");
        }
        char firstLetterName = firstName.charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Ваше имя начинается на букву M");
        } else if(firstLetterName == 'I') {
            System.out.println("Ваше имя начинается на букву И");
        } else {
            System.out.println("Ваше имя начинается на букву " + firstLetterName);
        }

        System.out.println("\n------------------\n");
        
        // Task 2 Поиск max и min числа
        System.out.println("Task 2");
        int firstNumber = 2414;
        int secondNumber = 2414;

        if(firstNumber > secondNumber) {
            System.out.println("Число " + firstNumber + " больше чем " + secondNumber);
        }else if(secondNumber > firstNumber) {
            System.out.println("Число " + secondNumber + " больше чем " + firstNumber);
        }else{
            System.out.println("Числа равны");
        }

        System.out.println("\n------------------\n");
        
        // Task 3 Проверка числа
        System.out.println("Task 3");
        int anythingNumber = -723;
        if(anythingNumber != 0) {
            if(anythingNumber % 2 == 0) {
                System.out.println("Число четное");
                if(anythingNumber < 0) {
                    System.out.println("Число меньше 0");
                }else {
                    System.out.println("Число больше 0");
                }
            }else {
                System.out.println("Число нечетное");
                if(anythingNumber < 0) {
                    System.out.println("Число меньше 0");
                }else {
                    System.out.println("Число больше 0");
                }
            }
        }

        System.out.println("\n------------------\n");
        
        // Task 4 Поиск одинаковых цифр в числах
        System.out.println("Task 4");
        firstNumber = 567;
        secondNumber = 123;
        int equalNumber = -1;
        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secondNumber);
        if((firstNumber / 100) == (secondNumber / 100)) {
            System.out.println("Число " + firstNumber / 100 + " есть в двух числах в сотнях");
            equalNumber++;
        }
        if(((firstNumber / 10) % 10) == ((secondNumber / 10) % 10)) {
            System.out.println("Число " + (firstNumber / 10) % 10 + " есть в двух числах в десятках");
            equalNumber++;
        }
        if((firstNumber % 10) == (secondNumber % 10)) {
            System.out.println("Число " + firstNumber % 10 + " есть в двух числах в еденицах");
            equalNumber++;
        }
        if (equalNumber < 0) {
            System.out.println("Одинаковых чисел не найдно");
        }

        System.out.println("\n------------------\n");
        
        // Task 5 Определение символа по его коду
        System.out.println("Task 5");
        char simbol = '\u0057';
        System.out.println("Заданный символ: " + simbol);
        if(simbol >= 'a' && simbol <= 'z') {
            System.out.println("Заданный символ - маленькая буква");
        }else if(simbol >= 'A' && simbol <= 'Z') {
            System.out.println("Заданный символ - большая буква");
        }else if(simbol >= '0' && simbol <= '9') {
            System.out.println("Заданный символ - число");
        }else{
            System.out.println("Заданный символ - не буква и не число");
        }

        System.out.println("\n------------------\n");
        
        // Task 6 Подсчет суммы вклада и начисленных банком %
        System.out.println("Task 6");
        int deposit = 300_000;
        int procent = 0;
        if(deposit < 100_000) {
            procent = 5;
        }else if(deposit >= 100_000 && deposit <= 300_000) {
            procent = 7;
        }else {
            procent = 10;
        }
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный % " + procent);
        System.out.println("Итоговая сумма с % " + deposit * (1.0 + procent / 100.0));

        System.out.println("\n------------------\n");
        
        // Task 7 Подсчет суммы вклада и начисленных банком %
        System.out.println("Task 7");
        int history = 59;
        int programmer = 91;
        int historyPoint = 0;
        int programmerPoint = 0;
        if(history <= 60) {
            historyPoint = 2;
            System.out.println("История - 2");
        }else if(history > 60 && history <= 73) {
            historyPoint = 3;
            System.out.println("История - 3");
        }else if(history > 73 && history <= 91) {
            historyPoint = 4;
            System.out.println("История - 4");
        } else {
            historyPoint = 5;
            System.out.println("История = 5");
        }
        if(programmer <= 60) {
            programmerPoint = 2;
            System.out.println("Программирование - 2");
        }else if(programmer > 60 && programmer <= 73) {
            programmerPoint = 3;
            System.out.println("Программирование - 3");
        }else if(programmer > 73 && programmer <= 91) {
            programmerPoint = 4;
            System.out.println("Программирование - 4");
        } else {
            programmerPoint = 5;
            System.out.println("Программирование = 5");
        }
        System.out.println("Средняя оценка по предметам: " + (historyPoint + programmerPoint) / 2.0);
        System.out.println("Средний % по предметам: " + (history + programmer) / 2.0);

        System.out.println("\n------------------\n");
        
        // Task 8 Расчет прибыли за год
        System.out.println("Task 8");
        int rent = 5_000;
        int sale = 50_000;
        int costPrice = 9_000;
        int year = (sale * 12) - (costPrice * 12) - (rent * 12);
        if(year > 0) {
            System.out.println("Прибыль за год +" + year + " руб.");
        }else{
            System.out.println("Прибыль за год " + year + " руб.");
        }

        System.out.println("\n------------------\n");
        
        // Task 9 Подсчет количества банкнот
        System.out.println("Task 9");
        int sum = 567;
        int sum100 = 10;
        int sum10 = 5;
        int sum1 = 50;

        System.out.println("Номиналы банкнот в банкомате: \n100 - " + sum100 + " шт." 
                + "\n10 - " + sum10 + " шт." 
                + "\n1 - " + sum1 + " шт.");

        int allMoney = sum100 * 100 + sum10 * 10 + sum1 * 1;

        if(allMoney < sum) {
            System.out.println("В банкомате нет необходимого количества денег");
        }else{
            int control = 0;
            int firstSum = sum / 100;
            if(firstSum > sum100) {
                System.out.println("Выдано купюр номиналом 100: " + sum100);
                sum -= sum100 * 100;
                control += sum100 * 100;
                sum100 = 0;
            }else{
                System.out.println("Выдано купюр номиналом 100: " + firstSum);
                sum100 -= firstSum;
                sum -= firstSum * 100;
                control += firstSum * 100;
            }
            int secondSum = sum / 10;
            if(secondSum > sum10) {
                System.out.println("Выдано купюр номиналом 10: " + sum10);
                sum -= sum10 * 10;
                control += sum10 * 10;
                sum10 = 0;
            }else{
                System.out.println("Выдано купюр номиналом 10: " + secondSum);
                sum10 -= secondSum;
                sum -= secondSum * 10;
                control += secondSum * 10;
            }
            int lastSum = sum % 100;
            if(lastSum > sum1) {
                System.out.println("Выдано купюр номиналом 1: " + sum1);
                sum -= sum1;
                control += sum1;
                sum1 = 0;
            }else{
                System.out.println("Выдано купюр номиналом 1: " + lastSum);
                sum1 -= lastSum;
                sum -= lastSum;
                control += lastSum;
            }
            System.out.println("Всего выдано:" + control);
            System.out.println("Номиналы банкнот в банкомате: \n100 - " + sum100 + " шт." 
                    + "\n10 - " + sum10 + " шт." 
                    + "\n1 - " + sum1 + " шт.");
        }
    }
}

