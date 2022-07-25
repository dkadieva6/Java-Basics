package ForLoop.Lab4;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int diff = 0;

        //Леви числа
        int sumLeft = 0;
        for (int i = 0; i < n; i ++){
            int number = Integer.parseInt(scanner.nextLine());
            sumLeft += number;
        }

        //Десни числа
        int sumRight = 0;
        for (int i = n; i < 2 * n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            sumRight += number;
        }

        diff = Math.abs(sumLeft - sumRight);
        if (diff == 0){
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
