package sho9;

/**
 * 科目を表すクラスの利用（Heikin7.java）
 */
public class Heikin7 {
    public static void main(String[] args) {
        Kamoku[] kamoku = {
                new Kamoku("国語", 63),
                new Kamoku("数学", 90),
                new Kamoku("英語", 75),
                new Kamoku("理科", 45),
                new Kamoku("社会", 81),
        };
        int sumSrore = 0;
        for (int i = 0; i < kamoku.length; i++) {
            System.out.println(kamoku[i]);
            sumSrore += kamoku[i].kamokuTensu;
        }
        double heikinScore = (double) sumSrore / kamoku.length;
        System.out.println("平均は" + heikinScore + "点");
    }
}
