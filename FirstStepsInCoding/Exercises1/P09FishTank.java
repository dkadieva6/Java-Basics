package FirstStepsInCoding.Exercises1;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width =  Integer.parseInt(scanner.nextLine());
        int heigth = Integer.parseInt(scanner.nextLine());
        double percentAcc = Double.parseDouble(scanner.nextLine());

        double volume = length * width * heigth;
        double volumeInLiters = volume / 1000;
        double occupatedSpace = percentAcc / 100;
        // double result = volumeInLiters - (volumeInLiters * (percentAcc / 100.0)
        double litersNeeded = volumeInLiters * (1 - occupatedSpace);

        System.out.println(litersNeeded);

    }
}
