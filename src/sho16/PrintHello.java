package sho16;

/**
 * 問題16-2 誤りを修正してください
 * <pre>{@code
 * class LabelPrinter {
 *     String label = "no label";
 *
 *     LabelPrinter(String label) {
 *         this.label = label;
 *     }
 *
 *     @Override
 *     public void run() {
 *         while (true) {
 *             System.out.println(label);
 *             Thread.sleep(1000);
 *         }
 *     }
 * }
 *
 * public class PrintHello {
 *     public static void main(String[] args) {
 *         LabelPrinter th = new LabelPrinter("こんにちは！");
 *     }
 * }
 * }<pre/>
 */
public class PrintHello {
    public static void main(String[] args) {
        LabelPrinter thread = new LabelPrinter("こんにちは！");
        thread.start();
    }
}
