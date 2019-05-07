package sho6;

/**
 * list6-3とlist6-4を参考にして、0～9の2乗のグラフを描くプログラムを作ってください。
 */
public class DrawGraph2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < i * i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
