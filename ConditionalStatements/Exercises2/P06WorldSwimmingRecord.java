package ConditionalStatements.Exercises2;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForUnitDistance = Double.parseDouble(scanner.nextLine());

        double allTime = distance * timeForUnitDistance;
        double resistanceTime = Math.floor(distance / 15) * 12.5;

        double totalTimePlusResistance = allTime + resistanceTime;

        if (totalTimePlusResistance < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimePlusResistance);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTimePlusResistance - worldRecord);
        }
    }
}
