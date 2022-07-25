package ConditionalStatements.Exercises2;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int procs = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250;
        double procsPrice = procs * (videoCardsPrice * 0.35);
        double ramPrice = ram * (videoCardsPrice * 0.10);

        double totalSum = videoCardsPrice + procsPrice + ramPrice;

        if (videoCards > procs){
            totalSum = totalSum * 0.85;
        }

        if (totalSum <= budget){
            System.out.printf("You have %.2f leva left!", Math.abs(budget - totalSum));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - totalSum));
        }
    }
}
