package ConditionalStatements.Lab2;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        // Вярна парола - "s3cr3t!P@ssw0rd"

        if (password.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else System.out.println("Wrong password!");
    }
}
