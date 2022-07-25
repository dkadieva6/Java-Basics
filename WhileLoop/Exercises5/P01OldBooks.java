package WhileLoop.Exercises5;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();

        String inputLine = scanner.nextLine();
        int counterBooks = 0;
        boolean wasFound = false;
        while (!inputLine.equals("No More Books")){
            String currentBook = inputLine;

            if(currentBook.equals(wantedBook)){
                wasFound= true;
                break;
            }

            inputLine = scanner.nextLine();
            counterBooks++;
        }
        if (wasFound){
            System.out.printf("You checked %d books and found it.", counterBooks);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", counterBooks);
        }
    }
}
