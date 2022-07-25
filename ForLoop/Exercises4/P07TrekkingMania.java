package ForLoop.Exercises4;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());

        int numberPeople = 0;
        double musala = 0;
        double monblan = 0;
        double kilimadjaro = 0;
        double k2 = 0;
        double everest = 0;

        for (int i = 0; i < groups; i++){
            int people = Integer.parseInt(scanner.nextLine());
            numberPeople += people;

            if (people <= 5){
                musala += people;
            } else if (people <= 12){
                monblan += people;
            } else if (people <= 25){
                kilimadjaro += people;
            } else if (people <= 40){
                k2 += people;
            } else {
                everest += people;
            }
        }
        System.out.printf("%.2f%%%n", musala / numberPeople * 100);
        System.out.printf("%.2f%%%n", monblan / numberPeople * 100);
        System.out.printf("%.2f%%%n", kilimadjaro / numberPeople * 100);
        System.out.printf("%.2f%%%n", k2 / numberPeople * 100);
        System.out.printf("%.2f%%%n", everest / numberPeople * 100);
    }
}
