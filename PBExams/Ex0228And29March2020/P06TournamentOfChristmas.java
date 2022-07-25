package PBExams.Ex0228And29March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfTournament = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;
        int countTotalWin = 0;
        int countTotalLost = 0;
        for (int i = 0; i < daysOfTournament; i++) {
            double dailyProfit = 0;
            int countDailyWinGames = 0;
            int countDailyLostGames = 0;

            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String typeGame = input;
                String gameResult = scanner.nextLine();

                if (gameResult.equals("win")){
                    dailyProfit += 20;
                    countDailyWinGames++;
                } else  {
                    countDailyLostGames++;
                }

                input = scanner.nextLine();
            }
            if (countDailyWinGames > countDailyLostGames){
                dailyProfit = dailyProfit * 1.10;
            }

            countTotalWin += countDailyWinGames;
            countTotalLost += countDailyLostGames;

            totalProfit += dailyProfit;
        }

        if (countTotalWin > countTotalLost){
            System.out.printf("You won the tournament! Total raised money: %.2f", totalProfit * 1.20);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalProfit);
        }
    }
}
