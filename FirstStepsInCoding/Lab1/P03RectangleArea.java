package FirstStepsInCoding.Lab1;

import java.util.Scanner;

public class P03RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитаме две цели числа от конзолата
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        //Пресмятане лицето на правоъгълника
        int area = a * b;

        System.out.println(area);


        //Само проверка, че четем правилно числата
        //System.out.println(a);
        //System.out.println(b);
    }
}
