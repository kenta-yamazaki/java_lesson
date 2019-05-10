package sho10;

/**
 * 学生
 */
public class Student {
    String studentName; //氏名
    int[] testScores;   //試験の点数

    public Student(String name, int score1, int score2, int score3) {
        this.testScores = new int[3];
        this.studentName = name;
        this.testScores[0] = score1;
        this.testScores[1] = score2;
        this.testScores[2] = score3;
    }

    @Override
    public String toString() {
        String result = "[" + studentName;
        for (int i = 0; i < testScores.length; i++) {
            result += "," + testScores[i];
        }
        result += "]";
        return result;
    }

    public int total() {
        int sumScore = 0;
        for (int i = 0; i < testScores.length; i++) {
            sumScore += testScores[i];
        }
        return sumScore;
    }
}
