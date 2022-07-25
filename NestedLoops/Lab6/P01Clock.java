package NestedLoops.Lab6;

import java.util.Scanner;

public class P01Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int h = 0; h <= 23; h++){
            for (int m = 0; m <= 59; m++){
                System.out.printf("%d:%d%n", h, m);

                // искаме да имаме водеща 0 пред цифрите между 0 и 9
                //System.out.printf("%02d:%02d%n", h, m);
            }
        }
    }
}
