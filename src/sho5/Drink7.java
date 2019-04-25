package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 下のプログラムは、入力された文字に応じて、<br>
 * 「あ」なら「オレンジジュースです」<br>
 * 「い」なら「コーヒーです」<br>
 * 「あ」「い」以外なら「どちらでもありません」<br>
 * と表示するプログラムです。<br>
 * if文を使っていますが、これをswitch文を使うように変更してください。
 * <pre>{@code
 *
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 *
 * public class Drink7 {
 *     public static void main(String[] args) {
 *         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 *         try {
 *             System.out.println("飲み物は何が好きですか？");
 *             System.out.println("あ＝オレンジジュース");
 *             System.out.println("い＝コーヒー");
 *             System.out.println("う＝どちらでもない");
 *             System.out.println("あ、い、うのどれかを選んでください。");
 *             String line = reader.readLine();
 *             if (line.equals("あ")) {
 *                 System.out.println("オレンジジュースです");
 *             } else if (line.equals("い")) {
 *                 System.out.println("コーヒーです");
 *             } else {
 *                 System.out.println("どちらでもありません");
 *             }
 *         } catch (IOException e) {
 *             System.out.println(e);
 *         }
 *     }
 * }
 * }<pre/>
 */
public class Drink7 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("あ＝オレンジジュース");
            System.out.println("い＝コーヒー");
            System.out.println("う＝どちらでもない");
            System.out.println("あ、い、うのどれかを選んでください。");
            String line = reader.readLine();
            switch (line) {
                case "あ":
                    System.out.println("オレンジジュースです");
                    break;

                case "い":
                    System.out.println("コーヒーです");
                    break;

                default:
                    System.out.println("どちらでもありません");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}