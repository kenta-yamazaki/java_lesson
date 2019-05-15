package sho9;

/**
 * 配列の初期化
 */
public class Heikin5 {
    public static void main(String[] args) {
        int[] score = {63, 90, 75, 45, 81};
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
