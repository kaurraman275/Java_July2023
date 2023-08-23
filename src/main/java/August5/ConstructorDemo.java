package August5;

 class ConstructorDemo {
     String name;
    int id;
    ConstructorDemo(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("Default constructor");
    }}
     class GFG{
     public static void main(String[] args) {
         ConstructorDemo constructorDemo = new ConstructorDemo("Raman",12);
         System.out.println("name is : " + constructorDemo.name + " "+ constructorDemo.id);

     }
}
