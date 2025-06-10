package Lab12.Chapter1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {"1. Orange cake", "2. Orange pie", "3. Orange juice", "4. Orange", "5. Orange ice-cream", "6. Black chocolate with orange"};
        List<String> cart = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAvailable products:");
            for(String product : products) {
                System.out.println(product);
            }

            System.out.println("\nChoose an option:");
            System.out.println("1. Add to cart");
            System.out.println("2. View cart");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product number to add to cart: ");
                    int productNumber = scanner.nextInt();

                    if (productNumber >= 1 && productNumber <= products.length){
                        cart.add(products[productNumber - 1]);
                        System.out.println(products[productNumber - 1] + " added to cart");
                    } else {
                        System.out.println("Invalid product number. Please try again");
                    }
                    break;
                case  2:
                    if(cart.isEmpty()){
                        System.out.println("Your cart is empty");
                    } else {
                        System.out.println("Your cart contains:");
                        for (String item : cart) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}