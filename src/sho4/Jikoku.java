package sho4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 現在の時刻（「時」だけでよい）をキーボードから入力すると、<br>
 * 午前中　　→　「おはようございます」0～11時<br>
 * 正午　　　→　「お昼です」12時<br>
 * 午後　　　→　「こんにちは」13時～18時<br>
 * 夜　　　　→　「こんばんは」19時～23時<br>
 * それ以外　→　「時刻の範囲を超えています」<br>
 * と、それぞれ表示するプログラムを書いてください。
 */
public class Jikoku {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("現在の時刻を入力してください。(「時」のみでけっこうです。)");
            String line = reader.readLine();
            int nowTime = Integer.parseInt(line);
            if (0 <= nowTime && nowTime <= 11) {
                System.out.println("おはようございます");
            } else if (nowTime == 12) {
                System.out.println("お昼です");
            } else if (13 <= nowTime && nowTime <= 18) {
                System.out.println("こんにちは");
            } else if (19 <= nowTime && nowTime <= 23) {
                System.out.println("こんばんは");
            } else {
                System.out.println("時刻の範囲を超えています");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
