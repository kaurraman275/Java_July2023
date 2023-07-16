package Assignment1;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int num1 = scanner.nextInt();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter second number :");
        int num2 = obj.nextInt();
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter third number :");
        int num3 = obj2.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Num1 is greater than Num3");

        }else if(num2>=num3){
            System.out.println("Num2 is greater than Num2");
        }else{
            System.out.println("Num3 is greatest of all" + " " + num3);
        }

    }
}
