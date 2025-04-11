package Lab1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        double square = width * height;

        System.out.println("Square of rectangle: " + square);
        scanner.close();
    }
}