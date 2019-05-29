package sho16;

/**
 * 問題16-7
 */
public class StarPrint2 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(3000);
                System.out.println("***");
            }
        } catch (InterruptedException e) {
        }
    }
}
