package sho15;

/**
 * list15-2 配列の確保
 */
public class GcArray1 {
    public static void main(String[] args) {
        while (true) {
            int[] array = new int[1000];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            System.out.println("残りのメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
