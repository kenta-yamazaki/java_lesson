package sho16;

/**
 * list16-8 Thread.sleepの例
 */
public class Periodic {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int time = i * 1000;
            System.out.println("Start sleep:time = " + time);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {

            }
        }
    }
}
