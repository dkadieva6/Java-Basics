package FirstStepsInCoding.Lab1;

import java.util.Scanner;

public class P04InchesToCentimeters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на входни данни
        double inches = Double.parseDouble(scanner.nextLine());

        //Пресмятания (конвертиране на инчове в сантиметри
            // 1 инч = 2.54 сантиметра
        double centimetes = inches * 2.54;

        //Принтиване на резултат (сантиметри)
        //System.out.println(inches);
        System.out.println(centimetes);
    }
}
