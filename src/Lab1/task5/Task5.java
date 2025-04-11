package Lab1.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your height(in meters): ");
        String heightStr = scanner.nextLine().replace(',', '.');
        double height = Double.parseDouble(heightStr);

        System.out.print("Are you a student? (Yes/No): ");
        String input = scanner.nextLine();
        boolean students = input.equalsIgnoreCase("Yes");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + students);

        scanner.close();
    }
}