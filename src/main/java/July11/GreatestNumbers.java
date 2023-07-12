package July11;

import java.util.Scanner;

public class GreatestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
            System.out.println("Enter First Number");
            int first_number  = scanner.nextInt();
            System.out.println("Enter second number");
            int second_number = scanner.nextInt();
            System.out.println("Enter third number");
            int third_number = scanner.nextInt();
            if(first_number>=second_number && first_number>=third_number){
                System.out.println("First number is greater than third");
            }else if(second_number>= first_number && second_number >=third_number){
                System.out.println("Second number is greater than third number");
            }else {
                System.out.println("Third number is greatest of all");
            }
            System.out.println("do you want  to exit Press y for Yes and Press N for No?");
            input=  scanner.next();

        }
        while(input != "y");
    }
}

