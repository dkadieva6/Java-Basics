package PBExams.Ex0306And07April2019;

import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameMovie = scanner.nextLine();
        String hallType = scanner.nextLine();
        int soldTickets = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        if (nameMovie.equals("A Star Is Born")){
            switch (hallType){
                case "normal":
                    ticketPrice = 7.50;
                    break;
                case "luxury":
                    ticketPrice = 10.50;
                    break;
                case "ultra luxury":
                    ticketPrice = 13.50;
                    break;
            }
        } else if (nameMovie.equals("Bohemian Rhapsody")) {
            switch (hallType) {
                case "normal":
                    ticketPrice = 7.35;
                    break;
                case "luxury":
                    ticketPrice = 9.45;
                    break;
                case "ultra luxury":
                    ticketPrice = 12.75;
                    break;
            }
        } else if (nameMovie.equals("Green Book")) {
            switch (hallType) {
                case "normal":
                    ticketPrice = 8.15;
                    break;
                case "luxury":
                    ticketPrice = 10.25;
                    break;
                case "ultra luxury":
                    ticketPrice = 13.25;
                    break;
            }
        } else if (nameMovie.equals("The Favourite")) {
            switch (hallType) {
                case "normal":
                    ticketPrice = 8.75;
                    break;
                case "luxury":
                    ticketPrice = 11.55;
                    break;
                case "ultra luxury":
                    ticketPrice = 13.95;
                    break;
            }
        }
        System.out.printf("%s -> %.2f lv.", nameMovie, soldTickets * ticketPrice);
    }
}
