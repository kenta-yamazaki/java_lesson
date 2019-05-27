package sho16;

/**
 * 問題16-5 CountTenA.java(List16-1)では、runメソッドを実行しているのは1つのスレッドでした。<br>
 * 新たなスレッドを1つだけ生成するのではなく、3個生成して動作するようにプログラムを書き換えてください。<br>
 * クラスの名前はCountTen3とします。<br>
 * その際、java.lang.Threadクラスには、自分のスレッドの名前を得る次のようなメソッドがあります。<br>
 * これを利用して、表示を行なっているのがどのスレッドであるかわかるようにしてみましょう。
 * public final String getName()
 * 必要なら、現在のスレッドを得る以下のメソッドも利用してください。<br>
 * public static Thread currentThread()
 */
public class CountTen3 extends Thread {
    public static void main(String[] args) {
        CountTen3 count1 = new CountTen3();
        CountTen3 count2 = new CountTen3();
        CountTen3 count3 = new CountTen3();
        count1.start();
        count2.start();
        count3.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main:i = " + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " = " + i);
        }
    }
}
