import java.util.Vector;
import java.io.*;
public class ListOfNumbers {
    private Vector vector;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        vector = new Vector(SIZE);
        for(int i = 0; i < SIZE; i ++){
            vector.addElement(new Integer(i));
    }


}

    public static void main(String[] args) {

    }
    public void writeList(){
        PrintWriter out = null;
        try{
            System.out.println("Entering try statements ");
        out = new PrintWriter(new FileWriter("Output.txt"));
        for(int i =0; i < SIZE; i ++){
            out.println("Value at :" + i + " = " + vector.elementAt(i));
        }
    } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught " + "ArrayIndexOutOfBoundsException: " + e.getMessage());
        }catch (IOException e) {
            System.err.println("Caught  IoException: " + e.getMessage());
        }finally{
            if(out != null){
                System.out.println("Closing PrintWriter");
                out.close();
            }else{
                System.out.println("PrintWriter not open");
            }

            }
        }

    }
