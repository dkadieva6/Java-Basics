package WhileLoop.Exercises5;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coinsChange = change * 100;

        // 200 100 50 20 10 5 2 1
        // 123- 100 => 23
        // 23 - 20 => 3
        // 3 - 2 => 1
        // 1 - 1 => 0

        int countCoins = 0;
        while (coinsChange > 0){
            if (coinsChange >= 200){
                coinsChange -= 200;
                countCoins++;
            } else if (coinsChange >= 100){
                coinsChange -= 100;
                countCoins++;
            } else if (coinsChange >= 50){
                coinsChange -= 50;
                countCoins++;
            } else if (coinsChange >= 20){
                coinsChange -= 20;
                countCoins++;
            } else if (coinsChange >= 10){
                coinsChange -= 10;
                countCoins++;
            } else if (coinsChange >= 5){
                coinsChange -= 5;
                countCoins++;
            } else if (coinsChange >= 2){
                coinsChange -= 2;
                countCoins++;
            } else if (coinsChange >= 1){
                coinsChange -= 1;
                countCoins++;
            } else {
                break;
            }
        }
        System.out.println(countCoins);
    }

}
