package sho16;

/**
 * list16-7
 */
public class Runner2 extends Thread {

    @Override
    public void run() {
        doCommand();
    }

    public void doCommand() {
        System.out.println("OK2");
        Runner.stopRunning();
    }
}
