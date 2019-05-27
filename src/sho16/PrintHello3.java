package sho16;

/**
 * 問題16-3
 * LabelPrinter(問題16-2)を使って、「おはよう！」「こんにちは！」「こんばんは！」を<br>
 * それぞれ表示するスレッド3つを動かすクラスPrintHello3を宣言してください。<br>
 */
public class PrintHello3 {
    public static void main(String[] args) {
        LabelPrinter thread1 = new LabelPrinter("おはよう！");
        LabelPrinter thread2 = new LabelPrinter("こんにちは!");
        LabelPrinter thread3 = new LabelPrinter("こんばんは！");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
