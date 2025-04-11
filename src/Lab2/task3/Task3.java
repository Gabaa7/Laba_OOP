package Lab2.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть 2 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        System.out.print("Максимальне число:"+ max);

        scanner.close();
    }
}