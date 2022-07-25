package Exam11And12December2021;

import java.util.Scanner;

public class P01PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processor = Double.parseDouble(scanner.nextLine());
        double videoCard = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());
        int numberRam = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double oneDollar = 1.57;
        double priceEnd = 0;

        double allRamPrice = 0;
        processor *= oneDollar;
        videoCard *= oneDollar;
        ram *= oneDollar;
        allRamPrice = ram * numberRam;
        processor = processor - discount * processor;
        videoCard = videoCard - discount * videoCard;
        priceEnd = processor + videoCard + allRamPrice;
        System.out.printf("Money needed - %.2f leva.", priceEnd);

    }
}
