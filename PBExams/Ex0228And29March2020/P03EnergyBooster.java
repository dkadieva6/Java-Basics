package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int sets = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;
        double totalPrice = 0;

        switch (fruit){
            case "Watermelon":
                if (size.equals("small")){
                    price = 56 * 2;
                } else if (size.equals("big")){
                    price = 28.70 * 5;
                }
                break;
            case "Mango":
                if (size.equals("small")){
                    price = 36.66 * 2;
                } else if (size.equals("big")){
                    price = 19.60 * 5;
                }
                break;
            case "Pineapple":
                if (size.equals("small")){
                    price = 42.10 * 2;
                } else if (size.equals("big")){
                    price = 24.80 * 5;
                }
                break;
            case "Raspberry":
                if (size.equals("small")){
                    price = 20 * 2;
                } else if (size.equals("big")){
                    price = 15.20 * 5;
                }
                break;
        }

        totalPrice = sets * price;

        if (totalPrice >= 400 && totalPrice <= 1000){
            discount = totalPrice * 0.15;
        } else if (totalPrice > 1000){
            discount = totalPrice * 0.50;
        }
        totalPrice -= discount;

        System.out.printf("%.2f lv.", totalPrice);
    }
}
