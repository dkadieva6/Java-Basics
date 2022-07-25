package PBExams.Ex0118And19July2020;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultsTickets = Integer.parseInt(scanner.nextLine());
        int kidsTickets = Integer.parseInt(scanner.nextLine());
        double priceAdultsTicket = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double priceKidsTickets = priceAdultsTicket * 0.30;
        priceAdultsTicket += priceService;
        priceKidsTickets += priceService;
        double totalTicketsPrice = (kidsTickets * priceKidsTickets) + (adultsTickets * priceAdultsTicket);
        double totalProfit = 0.20 * totalTicketsPrice;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, totalProfit);

    }
}
