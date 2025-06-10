package Lab12.Chapter4.handlers;

import java.util.Scanner;

public class UserInputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Ви ввели строку, будь ласка введіть цифру.");
            scanner.next();
        }

        int intInput = scanner.nextInt();
        scanner.nextLine();

        return intInput;
    }
}