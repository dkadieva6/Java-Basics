package PBExams.Ex0306And07April2019;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());
        double statuesPrice = 0.0;
        double cateringPrice = 0.0;
        double soundPrice = 0.0;

        statuesPrice = hallRent * 0.70;
        cateringPrice = statuesPrice * 0.85;
        soundPrice = 0.5 * cateringPrice;

        double expenses = hallRent + statuesPrice + cateringPrice + soundPrice;
        System.out.printf("%.2f", expenses);
    }
}
