package sho16;

/**
 * 問題16-7 問題16-6のクラスを、Runnableインタフェースを実装して作ってください。
 */
public class StarEqualPrint2 {
    public static void main(String[] args) {
        StarPrint2 starPrint2 = new StarPrint2();
        Thread thread1 = new Thread(starPrint2);
        thread1.start();
        EqualPrint2 equalPrint2 = new EqualPrint2();
        Thread thread2 = new Thread(equalPrint2);
        thread2.start();
    }
}
