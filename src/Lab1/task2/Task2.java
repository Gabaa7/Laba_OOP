package Lab1.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input radius circle : ");
        double radius = sc.nextDouble();

        radius = 3.14 * radius * radius;
        System.out.println("Your circle area: " + radius);


        sc.close();
    }
}