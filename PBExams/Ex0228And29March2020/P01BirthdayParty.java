package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P01BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentHall = Double.parseDouble(scanner.nextLine());
        double cake = 0.20 * rentHall;
        double drinks = 0.55 * cake;
        double animator = 1.0 * 1 / 3 * rentHall;

        double budget = rentHall + cake + drinks + animator;
        System.out.println(budget);

    }
}
