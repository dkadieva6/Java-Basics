package Exam11And12December2021;

import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double deer1 = Double.parseDouble(scanner.nextLine());
        double deer2 = Double.parseDouble(scanner.nextLine());
        double deer3 = Double.parseDouble(scanner.nextLine());

        double sumFood = (deer1 + deer2+ deer3) * days;

        double diff = Math.abs(sumFood - leftFood);

        if (sumFood <= leftFood){
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
