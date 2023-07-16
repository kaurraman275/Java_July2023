package July15;

import java.util.Scanner;
public class MethodOverloadingExample {
    public static void enterInput(int num1) {
        System.out.println("Enter your value :");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("Your Age is : " + value);

    }
    public static void enterInput(String name){
        System.out.println("Enter your name :");
        Scanner scanner = new Scanner(System.in);
        String value2 = scanner.next();
        System.out.println("Your name is :" + value2);
    }
}

