public class CyclesTheme{
    public static void main(String[] args) {
        System.out.println("Task 1 Подсчет суммы четных и нечетных чисел do while");
        int startNumber= -10;
        int finishNumber = 21;
        int dubl = startNumber;
        int even =0;
        int odd = 0;
        do {
            if(dubl % 2 == 0) even++;
            else odd++;
            dubl++;
        } while(dubl <= finishNumber);
        System.out.printf("в промежутке [%d, %d] сумма четных чисел = %d, а нечетных = %d", 
            startNumber, finishNumber, even, odd);
        System.out.println("\n-------------------------------\n");

        System.out.println("Task 2 Вывод чисел в интервале (min и max) в порядке убывания");
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNimber = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if(min > firstNumber) min = firstNumber;
        if(min > secondNumber) min = secondNumber;
        if(min > thirdNimber) min = thirdNimber;
        if(max < firstNumber) max = firstNumber;
        if(max < secondNumber) max = secondNumber;
        if(max < thirdNimber) max = thirdNimber;
        for(int j = min; j <= max; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\n-------------------------------\n");

        System.out.println("Task 3 Вывод реверсивного числа и суммы его цифр");
        int digit = 1234;
        int dublicate = digit;
        String reverse = "";
        int sum = 0;
        int count = 0;

        while (digit != 0) {
            sum += digit % 10;
            reverse += Integer.toString(digit % 10);
            digit /= 10;
            count++;
        }

        System.out.printf("Сумма цифр в числе %d равна %d\n",dublicate, sum);
        System.out.printf("Реверс числа: %s\n", reverse);
        System.out.println("\n-------------------------------\n");

        System.out.println("Task 4 Вывод чисел на консоль в несколько строк");
        int startDigit = 1;
        int finishDigit = 24;
        int newLine = 1;
        for(int i = startDigit; i < finishDigit; i += 2) {
            System.out.printf("%5d", i);
            if(newLine % 5 == 0) System.out.println();
            newLine++;
        }

        while(newLine % 5 != 1) {
            System.out.printf("%5d", 0);
            newLine++;
        }
        System.out.println("\n-------------------------------\n");

        System.out.println("Task 5 Проверка количества двоек на четность/нечетность");
        int number = 3242592;
        int dublicateNumber = number;
        int countTwo = 0;
        int digit2 = 0;
        String odd2 = "нечетное";
        
        while(number !=0) {
            digit2 = number % 10;
            if(digit2 == 2) countTwo++;
            number /= 10;
        }

        if(countTwo % 2 ==0) odd2 = "четное";

        System.out.printf("Число %d содержит %d (%s) количество двоек",dublicateNumber, countTwo, odd2);
        System.out.println("\n-------------------------------\n");

        System.out.println("Task 6 Отображение фигур в консоли");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int triangle = 5;
        int triangleLine = triangle;

        while(triangle > 0) {
            triangleLine = triangle;
            while(triangleLine > 0) {
                System.out.print("#");
                triangleLine--;
            }
            triangle--;
            System.out.println();
        }

        System.out.println();
        int dollar = 2;
        int dollarLine;
        
        do {
            dollarLine = 3 - Math.abs(dollar);
            do {
                System.out.print("$");
                dollarLine--;
            } while (dollarLine != 0);
            dollar--;
            System.out.println();
        } while(dollar >= -2);
        System.out.println("\n-------------------------------\n");
    }
}