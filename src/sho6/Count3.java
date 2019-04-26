package sho6;

/**
 * 2乗と3乗の計算
 */
public class Count3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "の2乗は" + Math.pow(i, 2) + "で、");
            System.out.println("3乗は" + Math.pow(i, 3) + "です。");
        }
        System.out.println("end");
    }
}
