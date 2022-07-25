package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P05SuitcaseLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trunkCapacity = Double.parseDouble(scanner.nextLine());

        int counter = 0;
        int suitcasesCount = 0;
        double endCapacity = 0;
        boolean isEnd = false;
        String input = scanner.nextLine();
        while (!input.equals("End")){
            isEnd = false;
            double suitcaseCapacity = Double.parseDouble(input);
            counter++;
            endCapacity = suitcaseCapacity;

            if (counter == 3){
                suitcaseCapacity *= 1.10;
                counter = 0;
            }
            trunkCapacity -= suitcaseCapacity;

            if (trunkCapacity <= 0){
                break;
            }

            suitcasesCount++;
            isEnd = true;
            input = scanner.next();
        }

        if (isEnd){
            System.out.printf("Congratulations! All suitcases are loaded!%n");
        } else if (endCapacity > trunkCapacity){
            System.out.printf("No more space!%n");
        }

        System.out.printf("Statistic: %d suitcases loaded.", suitcasesCount);
    }
}
