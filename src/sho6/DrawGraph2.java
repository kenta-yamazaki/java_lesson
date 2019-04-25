package sho6;

/**
 * list6-3とlist6-4を参考にして、0～9の2乗のグラフを描くプログラムを作ってください。
 */
public class DrawGraph2 {
    public static void main(String[] args) {
        for (int number1 = 0; number1 < 10; number1++) {
            System.out.print(number1 + ":");
            for (int number2 = 0; number2 < number1 * number1; number2++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
