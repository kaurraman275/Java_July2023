package Assignment1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number Please :");
        int num = scanner.nextInt();
        int sum =0;
        for(int i =1; i <= num; i ++){
            if(i%2 != 0){
                sum = sum +i;
            }
            System.out.println("The sum of odd numbers is :" + num + " " + sum);
        }
    }
}
