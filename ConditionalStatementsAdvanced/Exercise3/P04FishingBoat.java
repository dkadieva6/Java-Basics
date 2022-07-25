package ConditionalStatementsAdvanced.Exercise3;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double priceBoat = 0;
        switch (season){
            case "Spring":
                priceBoat = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceBoat = 4200;
                break;
            case "Winter":
                priceBoat = 2600;
                break;
        }

        if (people <= 6){
            priceBoat = priceBoat * 0.90;
        } else if (people <= 11){
            priceBoat = priceBoat * 0.85;
        } else {
            priceBoat = priceBoat * 0.75;
        }

        if (people % 2 == 0 && !season.equals("Autumn")){
            priceBoat = priceBoat * 0.95;
        }

        double diff = Math.abs(priceBoat - budget);
        if (priceBoat <= budget){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
