package FirstStepsInCoding.Exercises1;

import java.util.Scanner;

public class P02RadiansToDegrees {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double radians = Double.parseDouble(scanner.nextLine());

         //градус = радиан * 180 / pi
        double degress = radians * 180 / Math.PI;

        System.out.println(degress);
    }
}
