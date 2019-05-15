package sho9;

/**
 * 配列の長さを5にする
 */
public class Heikin4 {
    public static void main(String[] args) {
        int[] score = new int[5];
        score[0] = 63;
        score[1] = 90;
        score[2] = 75;
        score[3] = 45;
        score[4] = 81;
        int sumScore = 0;
        for (int i = 0; i < score.length; i++) {
            sumScore += score[i];
        }
        double heikinScore = (double) sumScore / score.length;

        System.out.println("国語は" + score[0] + "点");
        System.out.println("数学は" + score[1] + "点");
        System.out.println("英語は" + score[2] + "点");
        System.out.println("理科は" + score[3] + "点");
        System.out.println("社会は" + score[4] + "点");
        System.out.println("平均点は" + heikinScore + "点");
    }
}
