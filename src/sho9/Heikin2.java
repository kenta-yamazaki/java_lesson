package sho9;

/**
 * Hekin1.javaを配列を使って書く
 */
public class Heikin2 {
    public static void main(String[] args) {
        int[] score = new int[3];
        score[0] = 63;
        score[1] = 90;
        score[2] = 75;

        double heikinScore = (score[0] + score[1] + score[2]) / 3.0;

        System.out.println("国語は" + score[0] + "点");
        System.out.println("数学は" + score[1] + "点");
        System.out.println("英語は" + score[2] + "点");
        System.out.println("平均点は" + heikinScore + "点");
    }
}
