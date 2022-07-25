package ConditionalStatements.Exercises2;

import java.util.Scanner;

public class P03Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (hour * 60) + minutes + 15;

        int newHour = allMinutes / 60;
        int newMin = allMinutes % 60;

        if (newHour > 23){
            newHour = 0;
            System.out.printf("%d:%02d", newHour, newMin);
        } else {
            System.out.printf("%d:%02d", newHour, newMin);
        }
    }
}
