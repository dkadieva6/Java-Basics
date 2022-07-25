package PBExams.Ex0118And19July2020;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceBags = Double.parseDouble(scanner.nextLine());
        double bagsKg = Double.parseDouble(scanner.nextLine());
        int daysUntilTrip = Integer.parseInt(scanner.nextLine());
        int numBags = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        if (bagsKg < 10){
            priceBags *= 0.20;
        } else if (bagsKg <= 20){
            priceBags *= 0.50;
        } else {
            priceBags = priceBags;
        }

        if (daysUntilTrip < 7){
            priceBags *= 1.40;
        } else if (daysUntilTrip <= 30) {
            priceBags *= 1.15;
        } else {
            priceBags *= 1.10;
        }

        totalSum = priceBags * numBags;
        System.out.printf("The total price of bags is: %.2f lv.", totalSum);
    }
}
