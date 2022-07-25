package FirstStepsInCoding.Exercises1;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPages = Integer.parseInt(scanner.nextLine());
        int readPagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalReadingHours = countPages / readPagesPerHour;
        int hoursPerDate = totalReadingHours / days;

        System.out.println(hoursPerDate);
    }
}
