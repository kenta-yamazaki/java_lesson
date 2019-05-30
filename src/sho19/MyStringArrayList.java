package sho19;

/**
 * 問題19-3<br>
 * ・コンストラクタの中でINITIAL_CAPACITY個の要素を持つStringの配列を、arrayフィールドに確保する。<br>
 * ・addメソッドで要素を追加する。配列arrayが一杯だったら、長さを２倍にした新しい配列を確保した上で追加する。<br>
 * ・getメソッドで要素を参照する。添字が範囲外なら、例外IndexOutOfBoundsExceptionをthrowする。<br>
 * ・sizeメソッドで格納されている要素数(ar.lengthではない)を返す。
 */
public class MyStringArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private String[] array;
    private int size;

    public MyStringArrayList() {
        array = new String[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(String string) {
        if (array.length == size) {
            String[] array2 = new String[array.length * 2];
            System.arraycopy(array, 0, array2, 0, array.length);
            array = array2;
        }
        array[size] = string;
        size++;
    }

    public String get(int number) {
        if (0 <= number && number <= array.length - 1) {
            return array[number];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyStringArrayList myArrayList = new MyStringArrayList();
        myArrayList.add("テスト1");
        myArrayList.add("テスト2");
        myArrayList.add("テスト3");
        myArrayList.add("テスト4");
        myArrayList.add("テスト5");
        System.out.println("格納数：" + myArrayList.size());
        for (int i = 0; i < myArrayList.size() + 4; i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
