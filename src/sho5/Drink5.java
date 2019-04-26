package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * list5-1のプログラムを修正して、1なら「オレンジジュースです」、<br>
 * 2なら「コーヒーです」、3なら「ミルクです」、<br>
 * それ以外なら「どれでもあれません」<br>
 * になるようにしてください。
 */
public class Drink5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("1 オレンジジュース");
            System.out.println("2 コーヒー");
            System.out.println("3 ミルク");
            System.out.println("4 どれでもありません");
            System.out.println("1,2,3,4のどれかを選んでください。");
            String line = reader.readLine();
            int userSelectNumber = Integer.parseInt(line);
            switch (userSelectNumber) {
                case 1:
                    System.out.println("オレンジジュースです");
                    break;

                case 2:
                    System.out.println("コーヒーです");
                    break;

                case 3:
                    System.out.println("ミルクです");
                    break;

                default:
                    System.out.println("どちらでもありません");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
