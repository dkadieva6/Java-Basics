package ForLoop.Exercises4;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (maxElement < number) {
                maxElement = number;
            }
        }
        int sumWithoutMaxNum = sum - maxElement;
        if (maxElement == sumWithoutMaxNum){
            System.out.printf("Yes%nSum = %d", maxElement);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxElement - sumWithoutMaxNum));
        }
    }
}
