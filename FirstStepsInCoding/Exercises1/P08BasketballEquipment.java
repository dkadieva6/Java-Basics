package FirstStepsInCoding.Exercises1;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //баскетболни кецове - 40% по-малка от таксата за една година
        //баскетболен екип - 20% по-евтина от кецовете
        //баскетболна топка - 1/4 от баскетболния екип
        //баскетболни аксесоари - 1/5 отбаскетболната топка

        int yearTax = Integer.parseInt(scanner.nextLine());

        double priceShoes = yearTax - (0.40 * yearTax);
        // priceShoes = yearTax * 0.60

        double priceSuit = priceShoes - (0.20 * priceShoes);
        // priceSuit = priceShoes * 0.80

        double priceBall = (1.0 / 4) * priceSuit;
        // priceBall = priceSuit / 4

        double priceAcc = (1.0 / 5) * priceBall;
        // priceAcc = priceBall / 5

        double equipment = yearTax + priceShoes + priceSuit + priceBall + priceAcc;
        System.out.println(equipment);


    }
}
