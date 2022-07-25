package NestedLoops.Lab6;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int product = 0;
        int countCombinations = 0;
        boolean isCombinationFound = false;
        for (int x = startOfInterval; x <= endOfInterval; x++){
            for (int y = startOfInterval; y <= endOfInterval; y++){
                product = x + y;
                countCombinations++;
                if (product == magicNumber){
                    isCombinationFound = true;
                    startOfInterval = x;
                    endOfInterval = y;
                    break;
                }
            }
            if (isCombinationFound){
                break;
            }
        }

        if (isCombinationFound){
            System.out.printf("Combination N:%d (%d + %d = %d)", countCombinations, startOfInterval, endOfInterval, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", countCombinations, magicNumber);
        }
    }
}
