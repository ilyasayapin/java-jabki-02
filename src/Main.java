import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Площадь круга вариант 1
        double radius1 = 10;
        double pi = 3.14;
        double S1 = radius1 * radius1 * pi;
        System.out.println(S1);
        System.out.println();

        //Площадь круга вариант 2 - импорт константы PI
        double radius2 = 100;
        double S2 = radius2 * radius2 * Math.PI;
        System.out.printf("Круг радиусом R=%s имеет площадь S=%s", radius2, S2);
        System.out.println();

        //Площадь круга вариант 3 - импорт константы, сканера + округление
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        double radius3 = sc.nextDouble();
        double S3 = radius3 * radius3 * Math.PI;
        double roundedS3 = Math.round(S3 * 100.0) / 100.0;
        System.out.printf("Круг радиусом R=%s имеет площадь S=%s", radius3, roundedS3);


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