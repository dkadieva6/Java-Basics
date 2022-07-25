package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsForOneMetresClimb = Double.parseDouble(scanner.nextLine());

        double time = meters * secondsForOneMetresClimb;
        double timeLate = Math.floor(meters / 50);
        timeLate *= 30;
        time += timeLate;
        double diff = time - recordInSeconds;

        if (time >= recordInSeconds){
            System.out.printf("No! He was %.2f seconds slower.", diff);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", time);
        }
    }
}
