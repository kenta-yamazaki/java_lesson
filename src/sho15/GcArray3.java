package sho15;

/**
 * gcメソッドで強制的にガーベッジコレクションを起こす
 */
public class GcArray3 {
    public static void main(String[] args) {
        for (int i = 0; true; i++) {
            int[] array = new int[1000];
            for (int j = 0; j < array.length; j++) {
                array[j] = j;
            }
            if (i % 100 == 0) {
                System.out.println("gcを呼び出します。");
                System.gc();
            }
            System.out.println("残りのメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
