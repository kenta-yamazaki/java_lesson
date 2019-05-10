package sho9;

/**
 * 最大値を求めましょう
 */
public class ShowMaxData {
    public static void main(String[] args) {
        int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        int maxData = data[0];
        for (int i = 0; i < data.length; i++) {
            maxData = Math.max(maxData, data[i]);
        }
        System.out.println("最大値は" + maxData + "です");
    }
}
