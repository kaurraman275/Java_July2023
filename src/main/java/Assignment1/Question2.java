package Assignment1;

import java.util.Scanner;

public class Question2 {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Character Value :");
            char c = scanner.next().charAt(0);
            int i =0;
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    i++;
            }
                    if(i ==1){
                        System.out.println("Entered charater is a vowel" + " " +c);
                    }else if((c >= 'a'&& c<= 'z')||(c >= 'A'&&c <= 'Z')){
                        System.out.println("Entered Character is a vowel "+c+" is Consonent");
                }else{
                        System.out.println("Not an alphabet");
                    }


            }
        }
