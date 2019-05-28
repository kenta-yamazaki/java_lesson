package sho16;

import java.util.concurrent.TimeUnit;

/**
 * list16-8 Thread.sleepの例
 */
public class Periodic {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Start sleep:time = " + i);
            try {
                TimeUnit.SECONDS.sleep(i);
            } catch (InterruptedException e) {

            }
        }
    }
}
