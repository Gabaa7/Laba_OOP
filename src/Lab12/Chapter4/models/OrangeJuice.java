package Lab12.Chapter4.models;

public class OrangeJuice extends BaseProduct {
    private final String origin;

    public OrangeJuice(String name, double price, int id, String origin) {
        super(name, price, id);
        this.origin = origin;
    }

    @Override
    public void getDescription() {
        System.out.println("Назва: " + name +
                "\nЦіна: "+ price + "₴" +
                "\nКраїна виготовлення: " + origin);
    }
}