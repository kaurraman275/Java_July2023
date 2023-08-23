package Assignment2;

public class Question4 {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,5,6};
        int tofind = 4;
        for(int i =0;i<=arr.length-1; i++){
            if(arr[i] == tofind){
            System.out.println("The index of  found value is :" + i);
        }
    }
}}
