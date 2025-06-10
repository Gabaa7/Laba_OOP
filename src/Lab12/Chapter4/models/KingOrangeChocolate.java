package Lab12.Chapter4.models;

public class KingOrangeChocolate extends BaseProduct {
    private final int length;
    private final int wight;

    public KingOrangeChocolate(String name, double price, int id, int length, int wight){
        super(name, price, id);
        this.length = length;
        this.wight = wight;
    }

    @Override
    public void getDescription() {
        System.out.println("Назва: " + name +
                "\nЦіна: " + price + "₴" +
                "\nДовжина: " + length + "cм" +
                "\nШирина: " + wight + "см");
    }
}