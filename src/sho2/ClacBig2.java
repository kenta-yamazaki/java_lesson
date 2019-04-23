package sho2;

/**
 * 大きな数の計算をやってみようと思って、List2-4を実行したところ、10000000000ではなく、
 * 1410065408と表示されてしまいました。どのように修正したら正しく10000000000と表示されるでしょうか。
 * public class ClacBig2 {
 *     public static void main(String[] args) {
 *         System.out.println(100000 * 100000);
 *     }
 * }
 */
public class ClacBig2 {
    public static void main(String[] args) {
        System.out.println(100000L * 100000);
    }
}
