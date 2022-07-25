package PBExams.Ex0118And19July2020;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";
        boolean isHatTrick = false;
        while (!input.equals("END")){
           String playerName = input;
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > maxGoals){
                maxGoals = goals;
                bestPlayer = playerName;
            }

            if (goals >= 10){
                break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if (maxGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
