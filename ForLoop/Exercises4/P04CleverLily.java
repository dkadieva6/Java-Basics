package ForLoop.Exercises4;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        int money = 0;
        int allMoney = 0;
        int brotherCount = 0;
        for (int i = 1; i <= age; ++i){
            if (i % 2 != 0){
                countToys++;
            } else {
                money += 10;
                allMoney += money;

                brotherCount++;
            }
        }

        int totalSum = allMoney + (countToys * toyPrice) - brotherCount;
        double diff = Math.abs(totalSum - washingMachine);
        if (totalSum >= washingMachine){
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
