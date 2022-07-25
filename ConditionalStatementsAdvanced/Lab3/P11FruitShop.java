package ConditionalStatementsAdvanced.Lab3;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isValid = true;
        double priceOneFruit = 0.00;

        if (dayOfWeek.equals("Monday")
                || dayOfWeek.equals("Tuesday")
                || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday")
                || dayOfWeek.equals("Friday")){
            if (fruit.equals("banana")){
                priceOneFruit = 2.50;
            } else if (fruit.equals("apple")){
                priceOneFruit = 1.20;
            } else if (fruit.equals("orange")){
                priceOneFruit = 0.85;
            } else if (fruit.equals("grapefruit")) {
                priceOneFruit = 1.45;
            } else if (fruit.equals("kiwi")) {
                priceOneFruit = 2.70;
            } else if (fruit.equals("pineapple")) {
                priceOneFruit = 5.50;
            } else if (fruit.equals("grapes")) {
                priceOneFruit = 3.85;
            } else {
                isValid = false;
            }
        } else if (dayOfWeek.equals("Saturday")
                || dayOfWeek.equals("Sunday")){
            if (fruit.equals("banana")){
                priceOneFruit = 2.70;
            } else if (fruit.equals("apple")){
                priceOneFruit = 1.25;
            } else if (fruit.equals("orange")){
                priceOneFruit = 0.90;
            } else if (fruit.equals("grapefruit")) {
                priceOneFruit = 1.60;
            } else if (fruit.equals("kiwi")) {
                priceOneFruit = 3.00;
            } else if (fruit.equals("pineapple")) {
                priceOneFruit = 5.60;
            } else if (fruit.equals("grapes")) {
                priceOneFruit = 4.20;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        double priceFruits = quantity * priceOneFruit;

        if (!isValid){
            System.out.println("error");
        } else {
            System.out.printf("%.2f", priceFruits);
        }
    }
}
