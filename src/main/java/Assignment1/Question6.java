package Assignment1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer Value :");
        int value = scanner.nextInt();
        for(int i = 1; i <= value ; i++){
            System.out.println("The cube of Entered Integer is " + value + " " + value*value*value);
        }
}}
