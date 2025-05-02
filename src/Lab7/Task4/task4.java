package Lab7.Task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserAccount account = new UserAccount("Габа", "секрет");

        System.out.println("!!! Вхід у систему !!!");

        System.out.print("Введіть пароль для входу у систему: ");
        String inputPassword = scanner.nextLine();

        if (account.login(inputPassword)) {
            System.out.println("Ви увійшли у систему, " + account.getUsername());

            System.out.println("\nБажаєте змінити пароль? (yes/no)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Введіть старий пароль: ");
                String oldPass = scanner.nextLine();

                System.out.print("Введіть новий пароль: ");
                String newPass = scanner.nextLine();

                account.changePassword(oldPass, newPass);
            }
        } else {
            System.out.println("Невірний пароль. Вхід заборонено.");
        }

        scanner.close();
    }
}
