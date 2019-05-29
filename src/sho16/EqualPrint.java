package sho16;

/**
 * 問題16-6
 */
public class EqualPrint extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000);
                System.out.println("=====");
            }
        } catch (InterruptedException e) {
        }
    }
}
