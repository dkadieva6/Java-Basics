package NestedLoops.Lab6;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            int moneySum = 0;
            while (moneySum < minimalBudget){
                double currentMoney = Double.parseDouble(scanner.nextLine());
                moneySum += currentMoney;
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
