package ExamPreparation;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        double statuesPrice = 0.70 * rent;
        double cateringPrice = 0.85 * statuesPrice;
        double soundPrice = 0.5 * cateringPrice;

        double expenses = rent + statuesPrice + cateringPrice + soundPrice;
        System.out.printf("%.2f",expenses);
    }
}
