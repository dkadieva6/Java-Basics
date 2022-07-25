package ExamPreparation;

import java.util.Scanner;

public class P04EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paintedEggs = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int maxEggs = 0;
        String maxEggsColour = "";
        for (int i = 1; i <= paintedEggs; i++){
            String colour = scanner.nextLine();
            switch (colour){
                case "red":
                    red++;
                    if (maxEggs < red){
                        maxEggs = red;
                        maxEggsColour = "red";
                    }
                    break;
                case "orange":
                    orange++;
                    if (maxEggs < orange){
                        maxEggs = orange;
                        maxEggsColour = "orange";
                    }
                    break;
                case "blue":
                    blue++;
                    if (maxEggs < blue){
                        maxEggs = blue;
                        maxEggsColour = "blue";
                    }
                    break;
                case "green":
                    green++;
                    if (maxEggs < green){
                        maxEggs = green;
                        maxEggsColour = "green";
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxEggsColour);
    }
}
