package Lab8.Task4;

public class task4 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(3.7, 8.4);

        System.out.println(shape.area());
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}