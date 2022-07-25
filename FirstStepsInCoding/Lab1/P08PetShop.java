package FirstStepsInCoding.Lab1;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packageDogs = Integer.parseInt(scanner.nextLine());
        int packageCats = Integer.parseInt(scanner.nextLine());

        // опаковка храна за кучета - 2,50 лв.
        // опаковка храна за котки - 4 лв.

        double priceDogsPackage = packageDogs * 2.50;
        double priceCatsPackage = packageCats * 4.0;

        double sum = priceDogsPackage + priceCatsPackage;

        System.out.println(sum);
    }
}
