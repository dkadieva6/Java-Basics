package Exam11And12December2021;

import java.util.Scanner;

public class P04GranpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        double sumQuantity = 0;
        double sumDegrees = 0;
        double average = 0;
        for (int i = 1; i <= days; i++){
            double quantity = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());

            sumQuantity += quantity;
            sumDegrees =  sumDegrees + degree * quantity;
        }

        average = sumDegrees / sumQuantity;

        System.out.printf("Liter: %.2f%n", sumQuantity);
        System.out.printf("Degrees: %.2f%n", average);

        if (average < 38){
            System.out.printf("Not good, you should baking!");
        } else if (average <= 42){
            System.out.printf("Super!");
        } else {
            System.out.printf("Dilution with distilled water!");
        }
    }
}
