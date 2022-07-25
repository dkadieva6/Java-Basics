package FirstStepsInCoding.Exercises1;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // пилешко меню - 10,35 лв.
        // меню с риба - 12,40 лв.
        // вегетарианско меню - 8,15 лв.
        // цена на доставката - 2,50 лв.

        int countChicken = Integer.parseInt(scanner.nextLine());
        int countFish = Integer.parseInt(scanner.nextLine());
        int countVegan = Integer.parseInt(scanner.nextLine());

        double priceAllChicken = countChicken * 10.35;
        double priceAllFish = countFish * 12.40;
        double priceAllVegan = countVegan * 8.15;

        double priceAllMenus = priceAllChicken + priceAllFish + priceAllVegan;

        double dessertPrice = 0.20 * priceAllMenus;
        double deliveryPrice = priceAllMenus + dessertPrice + 2.50;

        System.out.println(deliveryPrice);
    }
}
