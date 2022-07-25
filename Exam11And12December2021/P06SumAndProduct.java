package Exam11And12December2021;

import java.util.Scanner;

public class P06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int multiplication = 0;
        boolean isFoundValidCombination = false;
        for (int a = 1; a <= 9; a++){
            for (int b = 9; b >= a; b--){
                for (int c = 0; c <= 9; c++){
                    for (int d = 9; d >= c; d--){
                        sum = a + b + c + d;
                        multiplication = a * b * c * d;

                        if (!isFoundValidCombination){
                            if (sum == multiplication && n % 10 == 5){
                                isFoundValidCombination = true;
                                System.out.printf("%d%d%d%d", a, b, c, d);
                                break;
                            }
                        }

                        if (!isFoundValidCombination){
                            if (sum != 0){
                                if (multiplication / sum == 3 && n % 3 == 0){
                                    isFoundValidCombination = true;
                                    System.out.printf("%d%d%d%d", d, c, b, a);
                                    break;
                                }
                            }
                        }

                        sum = 0;
                        multiplication = 1;
                    }
                }
            }
        }

        if (!isFoundValidCombination){
            System.out.print("Nothing found");
        }
    }
}
