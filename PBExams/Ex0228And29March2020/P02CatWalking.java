package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int numberWalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int allMinutes = minutesWalk * numberWalks;
        double burnedCalories = allMinutes * 5;
        calories *= 0.50;

        if (burnedCalories >= calories){
            System.out.printf("Yes, the walk for your cat is enough. "
                    + "Burned calories per day: %.0f.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. "
                    + "Burned calories per day: %.0f.", burnedCalories);
        }

    }
}
