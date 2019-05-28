package sho16;

/**
 * list16-7 外からスレッドを終了させる
 */
public class Runner extends Thread {
    private static boolean running = true;

    public static void stopRunning() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            doCommand();
        }
    }

    public void doCommand() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        new Runner().start();
        new Runner2().start();
    }
}
