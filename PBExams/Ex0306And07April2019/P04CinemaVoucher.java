package PBExams.Ex0306And07April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucherPrice = Integer.parseInt(scanner.nextLine());

        int price = 0;
        String product = scanner.nextLine();
        while (!product.equals("End")){
            if (product.length() > 8){

            }
            if (voucherPrice <= 0){
                break;
            }

            product = scanner.nextLine();
        }
    }
}
