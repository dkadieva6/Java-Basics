package ForLoop.Exercises4;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        //Facebook - 150 лв.
        //Instagram - 100 лв.
        //Reddit - 50 лв.

        for (int i = 1; i <= countTabs; i++){
            if (salary > 0) {
                String websiteName = scanner.nextLine();

                switch (websiteName){
                    case "Facebook":
                        salary -= 150;
                        break;
                    case "Instagram":
                        salary -= 100;
                        break;
                    case "Reddit":
                        salary -= 50;
                        break;
                }
            }
        }

        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
