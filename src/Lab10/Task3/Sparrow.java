package Lab10.Task3;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("chip chip chip!!!");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow a flying!");
    }
}