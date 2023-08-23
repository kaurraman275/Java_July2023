package August5;

public class Animal{
   Animal(){
        System.out.println("Animal is created");
    }
}
class tiger extends Animal{
 tiger(){
        super();
        System.out.println("tiger is created");
    }
}
class TestSuper{
    public static void main(String[] args) {
       tiger t = new tiger();

    }
}

