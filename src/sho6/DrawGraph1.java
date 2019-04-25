package sho6;

/**
 * グラフの表示
 */
public class DrawGraph1 {
    public static void main(String[] args) {
        for (int number1 = 0; number1 < 10; number1++) {
            System.out.print(number1 + ":");
            for (int number2 = 0; number2 < number1; number2++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
