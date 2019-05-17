package sho13;

/**
 * Exception3（list13-3）の例外処理をmainメソッドのよひ出しだけ起き、<br>
 * try文はmyAssignメソッド中におさめてください。
 */
public class ExceptionTest3a {
    public static void main(String[] args) {
        int[] array = new int[3];
        myAssign(array, 100, 0);
        System.out.println("終了します");
    }

    static void myAssign(int[] myArray, int index, int value) {
        System.out.println("myAssignに来ました");
        try {
            System.out.println("代入します");
            myArray[index] = value;
            System.out.println("代入しました。");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入出来ませんでした");
            System.out.println("例外は" + e + "です");
        }
        System.out.println("myAssignから帰ります");
    }
}
