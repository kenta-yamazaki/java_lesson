package sho9;

/**
 * 小さな表計算
 */
public class Heikin6 {
    public static void main(String[] args) {
        int[][] scores = {
                {63, 90, 75, 45, 81},
                {85, 100, 95, 80, 90},
                {100, 100, 100, 100}
        };
        for (int i = 0; i < scores.length; i++) {
            int sumScore = 0;
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("¥t" + scores[i][j]);
                sumScore += scores[i][j];
            }
            System.out.println("¥t|" + (double) sumScore / scores[i].length);
        }
    }
}
