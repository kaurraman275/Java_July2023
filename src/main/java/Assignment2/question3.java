package Assignment2;

public class question3 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        System.out.println("The original array is :");
        for(int i =0; i<= arr.length-1;i++){
            System.out.println(arr[i] + " ");

        }
        System.out.println();
        System.out.println("Now the array in reverse will be : ");
        for(int i = arr.length-1;i >= 0;i--){
            System.out.println(arr[i] + " ");
        }

    }
}
