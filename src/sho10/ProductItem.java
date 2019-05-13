package sho10;

public class ProductItem {
    String name;  //名前
    int price;  //価格

    public ProductItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + "," + price + "]";
    }
}
