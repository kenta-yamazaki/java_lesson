package sho10;

/**
 * 科目の平均を求めるプログラム
 */
public class KamokuHeikin {
    public static void main(String[] args) {
        Kamoku[] kamoku = {
                new Kamoku("国語", 63),
                new Kamoku("数学", 90),
                new Kamoku("英語", 75),
                new Kamoku("理科", 45),
                new Kamoku("社会", 81),
        };
        int sumScore = 0;
        for (int i = 0; i < kamoku.length; i++) {
            System.out.println(kamoku[i]);
            sumScore += kamoku[i].kamokuScore;
        }
        double heikinScore = (double) sumScore / kamoku.length;
        System.out.println("平均点は" + heikinScore + "点");
    }
}
