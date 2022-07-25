package FirstStepsInCoding.Exercises1;

import java.util.Scanner;

public class P01USDToBGN {
    public static void main(String[] args) {
        //1. прочитаме вход
        //1.1 създаване на скенер
        Scanner scanner = new Scanner (System.in);

        //1.2 прочитане на данни
        String input = scanner.nextLine();

        //1.3 превръщане в чисто
        double USD = Double.parseDouble(input);

        //2. Логика
        //1 USD = 1.79549 BGN
        //2.1
        double lvOneUSD = 1.79549;

        //2.2
        double lv = USD * lvOneUSD;

        //3. Принтиране на изход и форматиране
        System.out.println(lv);
    }
}
