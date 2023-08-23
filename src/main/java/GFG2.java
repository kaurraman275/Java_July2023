public class GFG2 {
    public static void main(String[] args) {
        try{
            String str = "123";
            int num = Integer.parseInt(str);
            System.out.println("try block fully executed");
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Catch block excuted..");
        }
        finally{
        System.out.println("Outside try-catch clause");
    }
        System.out.println("Outside try-catch-finally clause");
}}
