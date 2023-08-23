package Assignment2;

public class Question2 {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,5,6};
        int min = arr[0];
        for(int i = 0;i < arr.length; i++){
            if(arr[i]<min)
                min= arr[i];

        }
        System.out.println("Minimum  number is : " + min);
    }
}
