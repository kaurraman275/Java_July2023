package july25;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the name :");
    String name = scanner.nextLine();

}}
