import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();

        //System.out.println(name);

        //Scanner scanner = new Scanner(System.in);
        //int number = Integer.parseInt(scanner.nextLine());

        //System.out.println(number);


        /*Scanner scanner = new Scanner(System.in);
        String text = "Hello Java!";
        String text2 = "Hello SoftUni!";
        System.out.printf("%s %s, text, text");
         */

        //System.out.println(text);
        //System.out.println(text2);

        boolean flag = false;
        for (int i = 0; i < 100; i++){
            for ( int j = 0; j < 100; j++){
                System.out.printf("Outer: %d  Inner: %d%n", i, j);
                if (i == 50 && j == 12){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("For loops have been broken!");
                break;
            }
        }
    }
}
