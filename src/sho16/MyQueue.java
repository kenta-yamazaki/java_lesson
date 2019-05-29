package sho16;

/**
 * list16-11
 */
public class MyQueue {
    int[] intBuffer;
    int start;
    int count;

    public MyQueue(int size) {
        intBuffer = new int[size];
        start = 0;
        count = 0;
    }

    public synchronized void put(int n) throws InterruptedException {
        while (count >= intBuffer.length) {
            System.out.println(Thread.currentThread().getName() + "wait : バッファの空きを待つ");
            wait();
        }
        int end = (start + count) % intBuffer.length;
        intBuffer[end] = n;
        count++;
        notifyAll();
    }

    public synchronized int take() throws InterruptedException {
        while (count == 0) {
            System.out.println(Thread.currentThread().getName() + "wait : データを待つ");
            wait();
        }
        int n = intBuffer[start];
        start = (start + 1) % intBuffer.length;
        count--;
        notifyAll();
        return n;
    }
}
