import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Основное ДЗ
        String myFmilySize;
        final int NUM = 7;
        String word = "Television";
        myFmilySize = NUM + word;
        System.out.println(myFmilySize);

        if (NUM < 0) {
            System.out.println("Вы соханили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else
            System.out.println("Вы сохранили ноль");

        // ДЗ на сообразительность!!!!
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.next();
        System.out.println("Здравствуйте" + name + "!");
    }

}