 abstract  class Shape {
    abstract void draw();
}
class Rectangle  extends Shape{

    void draw() {
        System.out.println("drawing rectangle");
    }
        static class TestAbstration{
            public void main(String[] args) {
                Shape s = new Rectangle();
                s.draw();

            }
        }
    }

