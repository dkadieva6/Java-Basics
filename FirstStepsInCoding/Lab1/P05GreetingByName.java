package FirstStepsInCoding.Lab1;

import java.util.Scanner;

public class P05GreetingByName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        String name = scanner.nextLine();

        //Принтиране на резултата
            //отпечатва "Hello, <name>!"
        System.out.println("Hello, " + name + "!");
    }
}
