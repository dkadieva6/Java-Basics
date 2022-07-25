package FirstStepsInCoding.Lab1;

import java.util.Scanner;

public class P07ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());

        int hours = countProjects * 3;

        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + countProjects + " project/s.");
    }
}
