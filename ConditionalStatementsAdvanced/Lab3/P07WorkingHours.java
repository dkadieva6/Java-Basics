package ConditionalStatementsAdvanced.Lab3;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (dayOfWeek.equals("Monday")){
            if (hour >= 10 && hour <= 18){
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Tuesday")){
            if (hour >= 10 && hour <= 18){
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Wednesday")){
            if (hour >= 10 && hour <= 18){
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Thursday")){
            if (hour >= 10 && hour <= 18){
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Friday")){
            if (hour >= 10 && hour <= 18){
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Saturday")){
            if (hour >= 10 && hour <= 18){
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Sunday")) {
            System.out.println("closed");
        }
    }
}
