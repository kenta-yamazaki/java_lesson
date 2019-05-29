package sho16;

/**
 * 問題16-10 SingleThreadProgram.javaのテストクラス
 */
public class Job {
    int number;

    public Job(int number) {
        this.number = number;
    }

    public void work() {
        System.out.println(this + " is working. ");
        try {
            int n = (int) (Math.random() * 10000);
            Thread.sleep(number);
        } catch (InterruptedException e) {

        }
    }

    public String toString() {
        return "[Job " + number + " ]";
    }
}
