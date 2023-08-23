package August5;

public class MainTest3 {
    private String name;
    private  int id;

    public void display(){
        System.out.println("name is :" +name );
    }
    class child extends MainTest3{
        String fuel;
        public void display2(){
            System.out.println("fuel is :" +fuel);
        }

    }

    public static void main(String[] args) {
        MainTest3 mainTest3 = new MainTest3();
        mainTest3.display();


    }
}
