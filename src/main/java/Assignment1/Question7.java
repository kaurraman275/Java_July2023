package Assignment1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(number + "*" +i+ "=" +number*i);
        }
    }
}
