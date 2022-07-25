package PBExams.Ex0306And07April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberMovies = Integer.parseInt(scanner.nextLine());

        double ratingSum = 0;
        double averageRating;
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        String maxName = "";
        String minName = "";

        String movieName;
        for (int i = 0; i < numberMovies; i++){
            movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            ratingSum += rating;
            if (maxRating < rating){
                maxRating = rating;
                maxName = movieName;
            }
            if (minRating > rating){
                minRating = rating;
                minName = movieName;
            }
        }
        averageRating = ratingSum / numberMovies;

        System.out.printf("%s is with highest rating: %.1f%n", maxName, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", minName, minRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
