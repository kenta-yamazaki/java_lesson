package sho10;

public class ProductItem {
    /** 製品名 */
    String name;
    /** 製品価格 */
    int price;

    public ProductItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + "," + price + "]";
    }
}
