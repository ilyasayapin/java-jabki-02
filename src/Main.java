import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ДЗ
        //Задание №1
        //Площадь круга вариант 1
        double radius1 = 10;
        double pi = 3.14;
        double S1 = radius1 * radius1 * pi;
        System.out.println(S1);
        System.out.println(""); //для удобства просмотра в консоли

        //Площадь круга вариант 2 - импорт константы PI
        double radius2 = 100;
        double S2 = radius2 * radius2 * Math.PI;
        System.out.printf("Круг радиусом R=%s имеет площадь S=%s", radius2, S2);
        System.out.println(""); //для удобства просмотра в консоли
        System.out.println(""); //для удобства просмотра в консоли

        //Площадь круга вариант 3 - импорт константы, сканера + округление
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        double radius3 = sc.nextDouble();
        double S3 = radius3 * radius3 * Math.PI;
        double roundedS3 = Math.round(S3 * 100.0) / 100.0; //округление
        System.out.printf("Круг радиусом R=%s имеет площадь S=%s", radius3, roundedS3);
        System.out.println(""); //для удобства просмотра в консоли
        System.out.println(""); //для удобства просмотра в консоли

        //Задание №2
        //Перевод из градусов Цельсия в Фаренгейты - импорт сканера + округление
        System.out.print("Введите температуру в градусах Цельсия: ");
        double cels = sc.nextDouble(); //переиспользую переменную sc
        double fahr = cels * 9 / 5 + 32;
        double roundedfahr = Math.round(fahr * 100.0) / 100.0;
        System.out.printf("По шкале Фаренгейта это %s градусов.", roundedfahr);
        System.out.println(""); //для удобства просмотра в консоли
        System.out.println(""); //для удобства просмотра в консоли

        //Задание №3
        //Длина строки "Hello" вариант 1 - true|false
        Scanner sc2 = new Scanner(System.in);
        String wordthree = "Hello";
        System.out.println("Посчитай число букв в слове 'Hello'");
        System.out.print("Введите строку текста, равную по длине строке 'Hello': ");
        String wordfour = sc2.nextLine();
        System.out.printf("Эти строки имеют равную длину? %s", wordthree.length() == wordfour.length());
        System.out.println(""); //для удобства просмотра в консоли
        System.out.println(""); //для удобства просмотра в консоли

        //Длина строки "Hello" вариант 2 - импорт сканера, if
        String wordone = "Hello";
        System.out.print("Введите строку текста, равную по длине строке 'Hello': ");
        String wordtwo = sc2.nextLine(); //переиспользую переменную sc2
        if (wordtwo.length() == wordone.length()) {
            System.out.println("Верно! Эти строки равны по длине.");
            }
        else {
            System.out.println("Не верно! Вы ошиблись в подсчете букв =)");

        }
        System.out.println(""); //для удобства просмотра в консоли

        //Задание №4 Високосный год
        System.out.println("Давайте определим, является ли год високосным? ");
        System.out.print("Введите интересующий вас год в формате yyyy: ");
        int year = sc.nextInt(); //переиспользую переменную sc
        System.out.printf("Результат проверки: %s", year % 4 == 0);
        System.out.println(""); //для удобства просмотра в консоли
        System.out.println("");

        //Задание №5 Калькулятор ИМТ + сканер + перевод в м + округление
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Давайте определим ИМТ. Введите вес человека в кг: ");
        int ves = sc.nextInt(); //переиспользую переменную sc
        System.out.print("Теперь введите рост человека в см: ");
        double rost = sc3.nextInt() / 100.0; //перевод в метры сразу
        double imt = ves / (rost*rost);
        double roundedimt = Math.round(imt * 100.0) / 100.0; //округление
        System.out.printf("ИМТ равен: %s", roundedimt);

       //Задание №6 Таблица истинности для операторов && и ||
        System.out.println();
        System.out.println();
        System.out.println("Таблица истинности");
        System.out.println("A   B   A&B   A||B");
        System.out.println("0   0    0     0");
        System.out.println("1   0    0     1");
        System.out.println("0   1    0     1");
        System.out.println("1   1    1     1");


        /**



        //2
        String name = "Иванов Иван";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));

        //3
        System.out.println(10+15);
        System.out.println(10-2);
        System.out.println(2*2);
        System.out.println(10/5);

        System.out.println(10/3);
        System.out.println(10.0/3.0);

        System.out.println(10%3);

        System.out.println("a" + "b");

        //4
        System.out.println(1 > 2);
        System.out.println(2 == 2);
        System.out.println(2 >= 2);
        System.out.println(3 != 3);

        //5
        System.out.println(2 == 2 && 3 != 2);
        System.out.println(2 == 2 && 3 != 3);
        System.out.println(!((2 + 2) == 4));
        System.out.println(!((2 + 2) == 4) || true);

        //6
        /**
         * привет
         * привет
         */
        /**
        System.out.println("Привет, я " + name + "! Мне " + age + " лет.");
        System.out.printf("Привет, я %s! Мне %s лет.", name, age);

        int oddNumber = 3;
        System.out.println();
        System.out.printf("Число четное? %s", oddNumber % 2 == 0);

        System.out.println();
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        */


    }
}