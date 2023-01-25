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
        if(anythingNumber == 0) {

        }else if(anythingNumber)
    }
}

