package Lab9.Task4;

public class task {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(24, 6);

        Shape[] shapes = new Shape[2];

        shapes[0] = circle;
        shapes[1] = rectangle;

        System.out.println(shape1.area());
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}