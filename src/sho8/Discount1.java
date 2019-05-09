package sho8;

/**
 * 半額の計算をするプログラム
 */
public class Discount1 {
    public static void main(String[] args) {
        int originalPrice, halfPrice;
        originalPrice = 10000;
        halfPrice = originalPrice / 2;
        System.out.println("元の値段が" + originalPrice + "円なら、半額だと" + halfPrice + "円になります。");
    }
}
