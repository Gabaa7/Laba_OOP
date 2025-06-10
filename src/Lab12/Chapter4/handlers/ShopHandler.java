package Lab12.Chapter4.handlers;

import Lab12.Chapter4.models.BaseProduct;
import Lab12.Chapter4.models.OrangeProduct;

import static Lab12.Chapter4.services.Store.products;
import static Lab12.Chapter4.services.Store.wagon;

public class ShopHandler {

    public void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> addWagon();
            case 2 -> showWagon();
            case 3 -> delProd();
            case 4 -> applyDiscountToHeadphones();
            case 0 -> exitMarket();
            default -> System.out.println("\nНекоректний вибір!\n");
        }
    }

    public static void addWagon() {
        if (products.isEmpty()){
            System.out.println("Полиці магазину порожні.");
        }else {
            System.out.print("\nОберіть товар за номером: ");
            int numProd = UserInputHandler.getIntInput() - 1;
            if (numProd >= 0 && numProd < products.size()) {
                BaseProduct product = products.get(numProd);
                wagon.add(product);
                product.getDescription();
                System.out.println("Товар додано до кошика.\n");
                products.remove(numProd);
            } else {
                System.out.println("Невірний номер товару.");
            }
        }
    }

    public static void showWagon() {
        System.out.println("\nВаш кошик:");
        if (wagon.isEmpty()) {
            System.out.println("Кошик порожній.\n");
        } else {
            for (int i = 0; i < wagon.size(); i++) {
                System.out.print((i + 1) + ".");
                wagon.get(i).getDescription();
                System.out.println();
            }
        }
    }

    public static void delProd() {
        if (wagon.isEmpty()) {
            System.out.println("Немає що видаляти, кошик порожній.\n");
        } else {
            if (wagon.size() == 1) {
                System.out.println("\nВаш кошик складається з " + wagon.size() + " позиції.");
            } else {
                System.out.println("\nВаш кошик складається з " + wagon.size() + " позицій.");
            }

            for (int i = 0; i < wagon.size(); i++) {
                System.out.print((i + 1) + ".");
                wagon.get(i).getDescription();
            }

            System.out.print("\nОберіть товар по номеру для видалення: ");
            int delProd = UserInputHandler.getIntInput() - 1;
            if (delProd >= 0 && delProd <= wagon.size()) {
                wagon.get(delProd).getDescription();
                System.out.println("Товар видалено з кошика.\n");
                products.add(wagon.get(delProd));
                wagon.remove(delProd);
            } else {
                System.out.println("Невірний номер.");
            }

            if (wagon.isEmpty()) {
                System.out.println("Кошик після видалення позиції став порожнім.\n");
            } else {
                System.out.println("Кошик після видалення товару став на " + wagon.size() + " позицій.\n");
                for (int i = 0; i < wagon.size(); i++) {
                    System.out.print((i + 1) + ".");
                    wagon.get(i).getDescription();
                }
            }
        }
    }

    public static void applyDiscountToHeadphones() {
        for (BaseProduct p : wagon) {
            if (p instanceof OrangeProduct head) {
                head.applyDiscount(10);
                System.out.println("Знижка 10% застосована до " + head.getName());
            }
        }
    }

    public static void exitMarket() {
        System.out.println("\nДякуємо за відвідування магазину!!!");
        System.exit(0);
    }
}