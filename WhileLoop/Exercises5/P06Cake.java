package WhileLoop.Exercises5;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int allPieces = width * length;

        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            int currentPieces = Integer.parseInt(input);
            allPieces -= currentPieces;

            if (allPieces <= 0){
                break;
            }

            input = scanner.nextLine();
        }

        if (allPieces <= 0){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPieces));
        } else {
            System.out.printf("%d pieces are left.", allPieces);
        }
    }
}
