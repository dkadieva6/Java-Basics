package ForLoop.Lab4;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i){
            int number = Integer.parseInt(scanner.nextLine());
            if (maxNumber < number){
                maxNumber = number;
            }
            if (minNumber > number){
                minNumber = number;
            }
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
