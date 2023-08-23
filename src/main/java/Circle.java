public class Circle {
    static double pi = 3.14;
     double radius;
   public double CalculateArea(double radius) {
        double area = radius*pi;

       return area;
   }
    public static void main(String[] args) {

       Circle circle = new Circle();

        System.out.println(circle.CalculateArea(10));


}}
