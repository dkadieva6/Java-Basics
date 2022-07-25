package PBExams.Ex0118And19July2020;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numJoinery = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        double singlePrice = 0;
        double totalPriceOrder = 0;

        switch (type){
            case "90X130":
                singlePrice = 110;
                totalPriceOrder = numJoinery * singlePrice;
                if (numJoinery > 30 && numJoinery <= 60){
                    totalPriceOrder *= 0.95;
                } else if (numJoinery > 60){
                    totalPriceOrder *= 0.92;
                }
                break;
            case "100X150":
                singlePrice = 140;
                totalPriceOrder = numJoinery * singlePrice;
                if (numJoinery > 40 && numJoinery <= 80){
                    totalPriceOrder *= 0.94;
                } else if (numJoinery > 80) {
                    totalPriceOrder *= 0.90;
                }
                break;
            case "130X180":
                singlePrice = 190;
                totalPriceOrder = numJoinery * singlePrice;
                if (numJoinery > 20 && numJoinery <= 50){
                    totalPriceOrder *= 0.93;
                } else if (numJoinery > 50) {
                    totalPriceOrder *= 0.88;
                }
                break;
            case "200X300":
                singlePrice = 250;
                totalPriceOrder = numJoinery * singlePrice;
                if (numJoinery > 25 && numJoinery <= 50){
                    totalPriceOrder *= 0.91;
                } else if (numJoinery > 50) {
                    totalPriceOrder *= 0.86;
                }
                break;
        }
        if (delivery.equals("With delivery")){
            totalPriceOrder += 60;
        }
        if (numJoinery > 99){
            totalPriceOrder *= 0.96;
        }

        if (numJoinery < 10){
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", totalPriceOrder);
        }
    }
}
