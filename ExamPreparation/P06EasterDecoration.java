package ExamPreparation;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());

        double totalIncome = 0;
        for (int i = 1; i <= clients; i++) {

            double itemPrice = 0;
            double allItemsPrice = 0;
            int countItems = 0;
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String item = input;
                switch (item) {
                    case "basket":
                        itemPrice = 1.50;
                        break;
                    case "wreath":
                        itemPrice = 3.80;
                        break;
                    case "chocolate bunny":
                        itemPrice = 7;
                        break;
                }
                allItemsPrice += itemPrice;
                countItems++;
                input = scanner.nextLine();
            }
            if (countItems % 2 == 0){
                allItemsPrice *= 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", countItems, allItemsPrice);
            totalIncome += allItemsPrice;
        }
        double averagePricePerClient = totalIncome / clients;
        System.out.printf("Average bill per client is: %.2f leva.", averagePricePerClient);
    }
}
