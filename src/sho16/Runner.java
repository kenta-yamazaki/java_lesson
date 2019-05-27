package sho16;

/**
 * list16-7 外からスレッドを終了させる
 */
public class Runner extends Thread {
    private boolean running = true;
    int i = 0;

    public void stopRunning() {
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
        stopRunning();
    }

    public static void main(String[] args) {
        new Runner().start();
    }
}
