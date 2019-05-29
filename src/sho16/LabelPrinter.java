package sho16;

/**
 * 問題16-2
 */
class LabelPrinter extends Thread {
    String label = "no label";

    LabelPrinter(String label) {
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(label);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
