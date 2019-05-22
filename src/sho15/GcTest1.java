package sho15;

/**
 * list15-1 ガーベッジコレクションの動作を確認するプログラム
 */
public class GcTest1 {
    public static void main(String[] args) {
        while (true) {
            String string = new String("ABCDEFGHIJKLMNOPQRSTU");
            System.out.println("残りのメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
