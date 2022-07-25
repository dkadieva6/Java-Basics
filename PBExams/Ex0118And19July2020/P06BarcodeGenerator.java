package PBExams.Ex0118And19July2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        //2345
        //6789

        int startUnits = startNum % 10;
        int startTens = startNum / 10 % 10;
        int startHundreds = startNum / 100 % 10;
        int startThousands = startNum / 1000 % 10;

        int endUnits = endNum % 10;
        int endTens = endNum / 10 % 10;
        int endHundreds = endNum / 100 % 10;
        int endThousands = endNum / 1000 % 10;

        for (int i = startThousands; i <= endThousands; i++){
            for (int j = startHundreds; j <= endHundreds; j++){
                for (int k = startTens; k <= endTens; k++){
                    for (int m = startUnits; m <= endUnits; m++){
                        boolean isOdd = (i % 2 != 0)
                                && (j % 2 != 0)
                                && (k % 2 != 0)
                                && (m % 2 != 0);
                        if (isOdd){
                            System.out.printf("%d%d%d%d ", i, j, k, m);
                        }
                    }
                }
            }
        }
    }
}
