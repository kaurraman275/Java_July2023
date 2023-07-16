package July_8_2023;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        int number =scanner.nextInt();
//user wants to continue asking more numbers for additions
        switch(number){
            case 1 :
                System.out.println("Enter First Number");
                int number1 = scanner.nextInt();
                System.out.println("Enter Second Number");
                int number2 = scanner.nextInt();
                int sum = number1 + number2;
                System.out.println(sum);
                break;

            case 2 :
                System.out.println("Enter Third Number");
                int number3 = scanner.nextInt();
                System.out.println("Enter Second Number");
                int number4 = scanner.nextInt();
                int Subtract = number3 + number4;
                System.out.println(Subtract);
                break;

            default:
                System.out.println("Invalid Input");




        }
    }
}
