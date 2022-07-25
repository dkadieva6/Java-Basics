package ConditionalStatements.Exercises2;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int sumTime = timeFirst + timeSecond + timeThird;

        //124 sec
        int minutes = sumTime / 60;
        int seconds = sumTime % 60;

        /*if (seconds < 10 ){
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }*/
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }

        //System.out.printf("%d:02d", minutes, seconds);
    }
}
