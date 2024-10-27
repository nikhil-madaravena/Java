abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Rectangle();
        shape2.draw();
    }
}
