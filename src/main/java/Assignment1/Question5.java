package Assignment1;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        System.out.println("Enter the five numbers :");
        for(int i = 1; i<= 5; i++){
            int num = scanner.nextInt();
            sum = sum + num;

        }
        System.out.println("The sum of five numbers is :" + " " + sum);
        average = sum/5;
        System.out.println("The average of 5 numbers is :" + " " + average);
    }
}
