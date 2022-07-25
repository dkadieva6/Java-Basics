package ExamPreparation;

import java.util.Scanner;

public class P05Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        int startPoints = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;
        String area = scanner.nextLine();
        while (!area.equals("Retire")){
            int points = Integer.parseInt(scanner.nextLine());

            switch (area){
                case "Double":
                    points *= 2;
                    break;
                case "Triple":
                    points *= 3;
                    break;
            }
            if (points <= startPoints){
                startPoints -= points;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }

            if (startPoints == 0){
                break;
            }

            area = scanner.nextLine();
        }

        if (startPoints == 0){
            System.out.printf("%s won the leg with %d shots.", playerName, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, unsuccessfulShots);
        }
    }
}
