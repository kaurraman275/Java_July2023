package Assignment2;

public class Question1 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int max = 0;
        for(int i = 0;i<= arr.length-1;i++){
            if(arr[i]>max)
                max= arr[i];

        }
        System.out.println("Largest number is : " +max);
    }
}
