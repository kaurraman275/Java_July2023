import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in java might be tricky , but it is fun enough");
            myWriter.close();
            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
