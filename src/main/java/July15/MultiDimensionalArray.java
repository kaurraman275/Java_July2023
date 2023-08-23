package July15;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println("Calculate the length of each array :");
        System.out.println("Length of row 1 : " + a[0].length);
        System.out.println("Length of row 2 : " + a[1].length);

        for(int i =0; i < a.length; i ++){
            for(int j = 0; j < a[i].length; j ++){
                System.out.println(a[i][j]);
            }
        }
    }
}
