package ConditionalStatements.Exercises2;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        //пъзел - 2,60 лв.
        //говореща кукла - 3 лв.
        //плюшено мече - 4,10 лв.
        //миньон - 8,20 лв.
        //камионче - 2 лв.
        double allSum = (puzzles * 2.60) +
                (dolls * 3.0) +
                (bears * 4.10) +
                (minions * 8.20) +
                (trucks * 2);

        int countAllToys = puzzles + dolls + bears + minions + trucks;

        if (countAllToys >= 50){
            allSum = allSum * 0.75;
        }

        allSum = allSum * 0.90;

        double diff = Math.abs(allSum - tripPrice);
        if (allSum >= tripPrice){
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
