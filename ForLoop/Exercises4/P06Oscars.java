package ForLoop.Exercises4;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double initAcademyPoints = Double.parseDouble(scanner.nextLine());
        int peopleAssess = Integer.parseInt(scanner.nextLine());

        double totalPoints = initAcademyPoints;
        for (int i = 1; i <= peopleAssess; i++) {

            String nameAssess = scanner.nextLine();
            double pointsAssess = Double.parseDouble(scanner.nextLine());

            double currentAssesPoints = (nameAssess.length() * pointsAssess) / 2;

            if (totalPoints < 1250.5) {
                totalPoints = totalPoints + currentAssesPoints;
            }
        }

        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for " +
                    "leading role with %.1f!", actorName, totalPoints);
        } else {
            double diff = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!",
                    actorName, diff);
        }
    }
}
