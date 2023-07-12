package July11;
import java.util.Scanner;
public class IterationDemo {
    //break will break the loop
    // continue will continue and skip the current iteration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number;

        for( int i = 1; i <= 10 ; i++){
          number = scanner.nextInt();
          if(number<0){
           break;

          }
    }
        System.out.println("Sorry you voilated the policy");
}}
