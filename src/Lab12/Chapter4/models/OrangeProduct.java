package Lab12.Chapter4.models;

import Lab12.Chapter4.interfaces.Discountable;

public class OrangeProduct extends BaseProduct implements Discountable {
    private final String country;
    private boolean discountApplied = false;
    private double discountedPrice;

    public OrangeProduct(String name, double price, int id, String country) {
        super(name, price, id);
        this.country = country;
        this.discountedPrice = price;
    }

    @Override
    public void getDescription() {
        System.out.println("Назва: " + name +
                "\nЦіна(за 1 кг): " + price + "₴" +
                "\nКраїна походження: " + country);
    }

    @Override
    public void applyDiscount(double percent) {
        if (!discountApplied) {
            discountedPrice = price - (price * percent / 100);
            discountApplied = true;
            System.out.println("Ціна після знижки на товар становить: " + discountedPrice);
            System.out.println();
        } else {
            System.out.println("Знижку вже було застосовано до товару.");
        }
    }

}