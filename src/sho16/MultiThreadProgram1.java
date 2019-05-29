package sho16;

/**
 * 問題16-10<br>
 * 下記のSingleThreadProgramクラスは、Job(仕事)というクラスのオブジェクトを１０個作って<br>
 * workというメソッドを呼び続けるものです。現在は、シングルスレッドのプログラムになっており、複数の仕事を<br>
 * for文でぐるぐる順番に実行しています。このプログラムをマルチスレッドに書き換えてください。<br>
 * クラスJobはどこかで宣言されているものとします。
 * マルチスレッドに書き換えてください
 * <pre>{@code
 * public class SingleThreadProgram {
 *     Job[] jobs;
 *     public SingleThreadProgram(int jobCount){
 *         jobs = new job[jobCount];
 *         for(int i = 0;i<jobCount;i++){
 *             jobs[i] = new Job(i);
 *         }
 *     }
 *     public void workAllJobs(){
 *         for(int i = 0;i<jobs.length;i++){
 *             jobs[i].work();
 *         }
 *     }
 *
 *     public static void main(String[] args){
 *         SingleThreadProgram self = new SingleThreadProgram(10);
 *         while (true){
 *             self.workAllJobs();
 *         }
 *     }
 * }
 * }<pre/>
 */
class JobThread extends Thread {
    Job job;

    public JobThread(int number) {
        job = new Job(number);
    }

    @Override
    public void run() {
        while (true) {
            job.work();
        }
    }
}

public class MultiThreadProgram1 {
    public MultiThreadProgram1(int jobCount) {
        for (int i = 0; i < jobCount; i++) {
            new JobThread(i).start();
        }
    }

    public static void main(String[] args) {
        new MultiThreadProgram1(10);
    }
}
