package sho13;

/**
 * list13-3 メソッドの呼び出しの中から投げられる例外
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        int[] array = new int[3];
        try {
            System.out.println("代入します");
            myAssign(array, 100, 0);
            System.out.println("代入しました。");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入出来ませんでした");
            System.out.println("例外は" + e + "です");
        }
        System.out.println("終了します");
    }

    static void myAssign(int[] myArray, int index, int value) {
        System.out.println("myAssignに来ました");
        myArray[index] = value;
        System.out.println("myAssignから帰ります");
    }
}
