package Lab9.Task1;

public class task1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Складання двох цілих чисел: " + calculator.add(7, 1));

        System.out.println("Складання чисел з плавачою комою: " + calculator.add(0.1252, 10.708));

        System.out.println("Складання трьох цілих чисел:" + calculator.add(4, 16, 22));
    }
}