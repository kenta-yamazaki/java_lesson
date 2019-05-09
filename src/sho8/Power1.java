package sho8;

/**
 * 引数が２つのメソッド
 */
public class Power1 {
    public static void main(String[] args) {
        System.out.println(getPower(8, 2));
    }

    /**
     * xのn乗の計算
     *
     * @param x 累乗する数字
     * @param n 累乗する回数
     * @return 累乗されて出た結果
     */
    public static int getPower(int x, int n) {
        int y = 1;
        for (int i = 0; i < n; i++) {
            y = y * x;
        }
        return y;
    }
}
