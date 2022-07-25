package FirstStepsInCoding.Lab1;

import java.util.Scanner;

public class P06ConcatenateData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        //Принтиране на резултата
        //System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + city + ".");

        System.out.printf("You are %s %s, a %d-years old person %s.", firstName, lastName, age, city);
    }
}
