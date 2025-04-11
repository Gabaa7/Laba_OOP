package Lab4.task8;

public class Task8 {

    public static int counter = 5;

    public static void main(String[] args) {
        System.out.println("Global counter before *: " + counter);
        setCounter(counter);
        System.out.println("Global counter after *: " + counter);
    }

    public static void setCounter(int counter) {
        counter *= 4;
        System.out.println("Counter * 4 :" + counter);
    }
}