package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chineseCoin = Integer.parseInt(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double result = 0;

        double bitIntoLv = bitcoins * 1168;
        double chineseIntoDollars = chineseCoin * 0.15;
        chineseIntoDollars *= 1.76;
        double lvIntoEuro = (bitIntoLv + chineseIntoDollars) / 1.95;
        commission = commission / 100 * lvIntoEuro;
        result = lvIntoEuro - commission;

        System.out.printf("%.2f", result);
    }
}
