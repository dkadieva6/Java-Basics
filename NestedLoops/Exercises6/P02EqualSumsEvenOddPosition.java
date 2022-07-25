package NestedLoops.Exercises6;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++){
            int currentNum = i;

            int sumOdd = 0;
            int sumEven = 0;
            for (int j = 6; j >= 1; j--){
                int digit = currentNum % 10;
                if (j % 2 == 0){
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }

                currentNum = currentNum / 10;
            }
            if (sumEven == sumOdd){
                System.out.print(i + " ");
            }
        }
    }
}
