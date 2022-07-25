package NestedLoops.Exercises6;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double averageGradeAllPresentations = 0;
        int counter = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String presentationName = input;
            double averageGrade = 0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                averageGrade += grade;
                counter++;
            }
            averageGradeAllPresentations += averageGrade;
            System.out.printf("%s - %.2f.%n", presentationName, averageGrade / n);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.%n", averageGradeAllPresentations / counter);
    }
}