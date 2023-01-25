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
    }
}

