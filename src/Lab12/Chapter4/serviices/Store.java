package Lab12.Chapter4.services;

import Lab12.Chapter4.models.*;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public static final List<BaseProduct> products = new ArrayList<>(
            List.of(
                    new OrangeJuice("Апельсиновий сік", 90, 1, "Україна"),
                    new OrangeProduct("Червоний апельсин ", 130, 2, "Китай"),
                    new KingOrangeChocolate("Королівський чорний шоколад зі шматочками апельсину", 2500, 3, 60, 30)
            )
    );

    public static final List<BaseProduct> wagon = new ArrayList<>();

    public static void showProducts() {
        System.out.println("Доступні товари в магазині:");
        for (int i = 0; i < products.size(); i++) {
            System.out.print((i + 1) + ". ");
            products.get(i).getDescription();
        }
    }
}