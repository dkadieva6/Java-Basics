package WhileLoop.Lab5;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String student = scanner.nextLine();

        int grade = 1;
        int poorGrade = 0;
        double allGreats = 0;
        while (grade <= 12){
            if (poorGrade == 2){
                break;
            }
            double yearGrade =  Double.parseDouble(scanner.nextLine());
            if (yearGrade < 4){
                poorGrade++;
                continue;
            }
            allGreats += yearGrade;
            grade++;
        }
        if (grade > 12){
            System.out.printf("%s graduated. Average grade: %.2f", student, allGreats / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", student, grade);
        }
    }
}
