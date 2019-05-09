package sho8;

/**
 * メソッドhalveを使って半額の計算
 */
public class Discount2 {
    public static void main(String[] args) {
        int originalPrice, halfPrice;
        originalPrice = 10000;
        halfPrice = halve(originalPrice);
        System.out.println("元の値段が" + originalPrice + "円なら、半額だと" + halfPrice + "円になります。");
    }

    public static int halve(int n) {
        return n / 2;
    }
}
