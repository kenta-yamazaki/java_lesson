package sho9;

/**
 * 国語・数学・英語の平均点を計算するプログラム
 */
public class Heikin1 {
    public static void main(String[] args) {
        int kokugoScore, suugakuScore, eigoScore;
        double heikinScore;

        kokugoScore = 63;
        suugakuScore = 90;
        eigoScore = 75;
        heikinScore = (kokugoScore + suugakuScore + eigoScore) / 3.0;

        System.out.println("国語は" + kokugoScore + "点");
        System.out.println("数学は" + suugakuScore + "点");
        System.out.println("英語は" + eigoScore + "点");
        System.out.println("平均点は" + heikinScore + "点");
    }
}
