package sho13;

/**
 * list13-7 printStackTraceを使った例
 */
public class ExceptionTest4 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        try {
            System.out.println("代入します");
            myAssign(myArray, 100, 0);
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入出来ませんでした");
            System.out.println("例外は" + e + "です");
            e.printStackTrace();
        }
        System.out.println("終了します");
    }

    static void myAssign(int[] array, int index, int value) {
        System.out.println("myAssignにきました");
        array[index] = value;
        System.out.println("myAssignから帰ります");
    }
}
