package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 飲み物の選択（文字による分岐）
 */
public class Drink2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("a オレンジジュース");
            System.out.println("b コーヒー");
            System.out.println("c どちらでもない");
            System.out.println("a,b,cのどれかを選んでください。");
            String line = reader.readLine();
            char moji = line.charAt(0);
            switch (moji) {
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
        }
    }
}
