package sho8;

/**
 * メソッドprintGraphを使って、下記のような放物線を書くプログラムを作ってください。
 * ****************************************************************
 * *************************************************
 * ************************************
 * *************************
 * ****************
 * *********
 * ****
 * *
 * <p>
 * *
 * ****
 * *********
 * ****************
 * *************************
 * ************************************
 * *************************************************
 * ****************************************************************
 */
public class Graph2 {
    public static void main(String[] args) {
        for (int n = -8; n <= 8; n++) {
            printGraph(n * n);
        }
    }

    public static void printGraph(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
