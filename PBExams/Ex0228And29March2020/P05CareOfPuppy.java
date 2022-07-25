package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodBought = Integer.parseInt(scanner.nextLine());

        int allFood = 0;
        int foodInGrams = 0;
        String input = scanner.nextLine();
        while (!input.equals("Adopted")){
            int eatenFood = Integer.parseInt(input);
            foodInGrams = foodBought * 1000;
            allFood += eatenFood;

            input = scanner.nextLine();
        }
        int diff = Math.abs(foodInGrams - allFood);
        if (foodInGrams >= allFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}
