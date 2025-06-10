package Lab12.Chapter4;

import Lab12.Chapter4.handlers.ShopHandler;
import Lab12.Chapter4.handlers.UserInputHandler;
import Lab12.Chapter4.services.Store;


public class Main {
    public static void main(String[] args) {
        ShopHandler shopHandler = new ShopHandler();

        while (true){
            Store.showProducts();
            showMenu();
            int choice = UserInputHandler.getIntInput();

            shopHandler.handleUserChoice(choice);
        }
    }

    public static void showMenu() {
        System.out.println("\nВиберіть дію:");
        System.out.println("1 - Додати товар до кошика");
        System.out.println("2 - Переглянути вміст кошика");
        System.out.println("3 - Видалити з кошика");
        System.out.println("4 - Використати купон на знижку для товару Червоний Апельсин");
        System.out.println("0 - Вихід з магазину");
    }
}