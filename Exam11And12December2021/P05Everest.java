package Exam11And12December2021;

import java.util.Scanner;

public class P05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int countDays = 1;
        int totalClimbedMeters = 5364;
        boolean isClimbEverest = false;

        while (!input.equals("END")){

            if (input.equals("Yes")){
                countDays++;
            }

            if (countDays > 5){
                break;
            }

            int climbedMetersPerDay = Integer.parseInt(scanner.nextLine());
            totalClimbedMeters += climbedMetersPerDay;

            if (totalClimbedMeters >= 8848){
                isClimbEverest = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isClimbEverest){
            System.out.printf("Goal reached for %d days!", countDays);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", totalClimbedMeters);
        }
    }
}
