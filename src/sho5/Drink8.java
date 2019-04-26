package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * list5-2を実行したとき、a,b,cの椅子れも入力せず、<br>
 * ただリターンキー（Enter）を押したところ、下のようなエラーになりました。<br>
 * これはなぜでしょうか。どうしたらこれを防げますか<br>
 * (これはswitch文の問題ではありません)。<br>
 * Exception in thread "main" java.lang.StringIndexOutOfBoundsException:<br>
 * String index out of range: 0<br>
 * at java.lang.String.charAt(String.java:658)<br>
 * at sho5.Drink2.main(Drink2.java:20)
 */
public class Drink8 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("a オレンジジュース");
            System.out.println("b コーヒー");
            System.out.println("c どちらでもない");
            System.out.println("a,b,cのどれかを選んでください。");
            String line = reader.readLine();
            char userSelectMoji = line.charAt(0);
            switch (userSelectMoji) {
                case 'a':
                    System.out.println("オレンジジュースです");
                    break;

                case 'b':
                    System.out.println("コーヒーです。");
                    break;

                default:
                    System.out.println("どちらでもありません。");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("何も入力されませんでした。");
        }
    }
}
/*
    なぜエラーが起こったのか？
    ↓
    lineは空文字なのに、line.charAt(0)で<br>
    lineの一番最初の添字を検出しようとしているから。
 */
