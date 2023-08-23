package August5;

 class ConstructorOverloadingDemo
{
    String name;
    int id;
    String city;
    int phone;
    ConstructorOverloadingDemo(String name, int id ){
        this.name = name;
        this.id = id;
        System.out.println("The name and id is :" + name + " " + id);
    }
    ConstructorOverloadingDemo(String city){
        System.out.println("The name of city is :" + city);
    }
}
class Geek{
    public static void main(String[] args) {
        ConstructorOverloadingDemo constructorOverloadingDemo = new ConstructorOverloadingDemo("Raman", 20);
        ConstructorOverloadingDemo constructorOverloadingDemo1 = new ConstructorOverloadingDemo("Jalandhar");

    }
}
