package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P04FoodFotPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double biscuits = 0;
        int countBiscuits = 0;
        double allFood = 0;
        double allEatenFood = 0;
        double catHasEaten = 0;
        double dogHasEaten = 0;
        for (int i = 1; i <= days; i++){
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0){
                biscuits = 0.10 * (catFood + dogFood);
                countBiscuits++;
            }

            dogHasEaten += dogFood;
            catHasEaten += catFood;
            allEatenFood = dogHasEaten + catHasEaten;
        }

        allFood = allEatenFood * 100 / food;
        dogHasEaten = dogHasEaten * 100 / allEatenFood;
        catHasEaten = catHasEaten * 100 / allEatenFood;

        biscuits *= countBiscuits;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", allFood);
        System.out.printf("%.2f%% eaten from the dog.%n", dogHasEaten);
        System.out.printf("%.2f%% eaten from the cat.", catHasEaten);

    }
}
