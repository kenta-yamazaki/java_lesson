package sho9;

/**
 * どうしてエラーになるのでしょうか
 *
 * <pre>{@code
 * public class CalcData {
 *     public static void main(String[] args) {
 *         double[] data = new double[5];
 *         data[0] = 3.1;
 *         data[1] = 4.1;
 *         data[2] = 5.9;
 *         data[3] = 2.6;
 *         data[4] = 5.3;
 *         data[5] = 9.7;
 *         double sumScore = 0.0;
 *         for (int i = 0; i <= data.length; i++) {
 *             sumScore += data[i];
 *         }
 *         System.out.println("sumScore = " + sumScore);
 *     }
 * }
 * エラー文↓
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
 * 	at sho9.CalcData.main(CalcData.java:11)
 * }</pre>
 */
public class CalcData {
    public static void main(String[] args) {
        double[] data = new double[6];
        data[0] = 3.1;
        data[1] = 4.1;
        data[2] = 5.9;
        data[3] = 2.6;
        data[4] = 5.3;
        data[5] = 9.7;
        double sumScore = 0.0;
        for (int i = 0; i < data.length; i++) {
            sumScore += data[i];
        }
        System.out.println("sumScore = " + sumScore);
    }
}
