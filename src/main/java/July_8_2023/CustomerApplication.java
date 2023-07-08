package July_8_2023;

import java.util.Scanner;

public class CustomerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CNC Communication");
        String name =scanner.next();

        switch(name){
            case "Pragra" :
                System.out.println("Adress of Pragra is :" + "110 Matheson Blvd W #160, Mississauga, ON L5R 4G7");
                break;
            case "CNC Tower" :
                System.out.println("Adress of CN Tower is:" + "CN Tower, 290 Bremner Blvd, Toronto, ON M5V 3L9");
                break;

        }
    }
}
