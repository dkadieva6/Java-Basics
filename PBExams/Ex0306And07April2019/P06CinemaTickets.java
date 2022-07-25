package PBExams.Ex0306And07April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        while (!movie.equals("Finish")){
            int freePlaces = Integer.parseInt(scanner.nextLine());
            int soldTickets = 0;

            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")){
                soldTickets++;
                switch (ticketType){
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                if (soldTickets == freePlaces){
                    break;
                }
                ticketType = scanner.nextLine();
            }
            totalTickets += soldTickets;

            System.out.printf("%s - %.2f%% full.%n", movie, 1.0 * soldTickets / freePlaces * 100);
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * studentTickets / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standardTickets / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * kidTickets / totalTickets * 100);

    }
}
