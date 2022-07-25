package ConditionalStatements.Exercises2;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0.0;
        if (points <= 100) {
            bonusPoints = 5;
        } else if (points <= 1000) {
            bonusPoints = 0.20 * points;
        } else {
            bonusPoints = 0.10 * points;
        }

        if (points % 2 == 0){
            bonusPoints = bonusPoints + 1;
        }

        if (points % 10 == 5){
            bonusPoints = bonusPoints + 2;
        }

        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);
    }
}

