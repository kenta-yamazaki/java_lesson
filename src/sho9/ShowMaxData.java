package sho9;

/**
 * 最大値を求めましょう
 */
public class ShowMaxData {
    public static void main(String[] args) {
        int[] array = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            maxNumber = Math.max(maxNumber, array[i]);
        }
        System.out.println("最大値は" + maxNumber + "です");
    }
}
