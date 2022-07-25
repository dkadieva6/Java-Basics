package ForLoop.Exercises4;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int finalPoints = startingPoints;
        double averagePoints = 0;
        double wins = 0;

        for (int i = 0; i < tournaments; i++){
            String text = scanner.nextLine();
            int points = 0;

            switch (text) {
                case "W":
                    points = 2000;
                    wins++;
                    break;
                case "F":
                    points = 1200;
                    break;
                case "SF":
                    points = 720;
                    break;
            }
            finalPoints += points;
            averagePoints += points;
        }

        averagePoints = averagePoints / tournaments;
        wins = (wins / tournaments) * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%%n", wins);

    }
}
