package sho9;

/**
 * 配列の添字を変数にする
 */
public class Heikin3 {
    public static void main(String[] args) {
        int[] score = new int[3];
        score[0] = 63;
        score[1] = 90;
        score[2] = 75;
        int sumScore = 0;
        for (int i = 0; i < 3; i++) {
            sumScore += score[i];
        }
        double heikinScore = sumScore / 3.0;

        System.out.println("国語は" + score[0] + "点");
        System.out.println("数学は" + score[1] + "点");
        System.out.println("英語は" + score[2] + "点");
        System.out.println("平均点は" + heikinScore + "点");
    }
}
