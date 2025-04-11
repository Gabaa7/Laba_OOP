package Lab1.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age: " + age);
        sc.close();
    }
}