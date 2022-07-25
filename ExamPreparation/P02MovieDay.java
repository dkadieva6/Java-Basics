package ExamPreparation;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movieTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneTime = Integer.parseInt(scanner.nextLine());

        // Подготовката на терен => movieTime * 0.15
        double prepare = movieTime * 0.15;
        // Време за заснемане на сцените => scenes * sceneTime
        double totalScenesTime = scenes * sceneTime;
        //Необходимо време
        double neededTime = prepare + totalScenesTime;

        // Проверка дали времето е достатъчно
        if (neededTime <= movieTime) {
            System.out.printf("You managed to finish the" +
                    " movie on time! You have %d minutes left!", Math.round(movieTime - neededTime));
        } else {
            System.out.printf("Time is up! To complete the " +
                    "movie you need %d minutes.", Math.round(neededTime - movieTime));
        }
    }
}
