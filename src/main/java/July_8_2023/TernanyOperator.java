package July_8_2023;
import java.util.Scanner;

public class TernanyOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number if even/odd?");
        int number =scanner.nextInt();

        String result = (number %2 ==0) ? "even" : "odd";
        System.out.println(result);
    }
}
