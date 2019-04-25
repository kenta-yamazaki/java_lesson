package sho6;

/**
 * 2乗と3乗の計算
 */
public class Count3 {
    public static void main(String[] args) {
        for (int number = 0; number < 10; number++) {
            System.out.print(number + "の2乗は" + (number * number) + "で、");
            System.out.println("3乗は" + (number * number * number) + "です。");
        }
        System.out.println("end");
    }
}
