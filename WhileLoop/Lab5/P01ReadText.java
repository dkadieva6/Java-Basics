package WhileLoop.Lab5;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Stop")){
                break;
            }
            System.out.println(input);
        }
        /*
        String input = scanner.nextLine();

        while (!input.equals("Stop")){
            System.out.println(input);
            input = scanner.nextLine();
        }
         */
    }

}
