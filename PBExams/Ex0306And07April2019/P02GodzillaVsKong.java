package PBExams.Ex0306And07April2019;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //декор - 10% от бюджета
        //>150 статиста, отстъпка за облеклото 10%

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceOneSuit = Double.parseDouble(scanner.nextLine());

        double decorSum = 0.10 * budget;
        double sumSuits = people * priceOneSuit;

        if (people > 150){
            sumSuits = sumSuits * 0.90;
        }

        double totalSum = decorSum + sumSuits;

        double diff = Math.abs(budget - totalSum);
        if (totalSum <= budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
    }
}
