package PBExams.Ex0118And19July2020;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ballsNum = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int otherColours = 0;
        for (int i = 1; i <= ballsNum; i++){
            String colour = scanner.nextLine();
            switch (colour){
                case "red":
                    red++;
                    totalPoints += 5;
                    break;
                case "orange":
                    orange++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    yellow++;
                    totalPoints += 15;
                    break;
                case "white":
                    white++;
                    totalPoints += 20;
                    break;
                case "black":
                    black++;
                    totalPoints = totalPoints / 2;
                    break;
                default:
                    otherColours++;
                    break;
            }
        }
        System.out.printf("Total points: %.0f%n", Math.floor(totalPoints));
        System.out.printf("Red balls: %d%n", red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", otherColours);
        System.out.printf("Divides from black balls: %d", black);

    }
}
