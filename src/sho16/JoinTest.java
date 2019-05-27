package sho16;

/**
 * list16-10 スレッドの終了を待つjoin
 */
public class JoinTest extends Thread {
    public static void main(String[] args) {
        JoinTest thread = new JoinTest();
        System.out.println("main:はじめ");
        thread.start();
        System.out.println("main:終了待ちに入る");
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("main:おわり");
    }

    @Override
    public void run() {
        System.out.println("run:スレッド実行開始");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("run:スレッド実行終了");
    }
}
