package sho4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * list4-1では1200％の降水確率が許されてしまいました。<br>
 * この部分を修正したのがlist4-2です
 */
public class Kasa2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("降水確率を入力してください。");
            String line = reader.readLine();
            int rainyPercent = Integer.parseInt(line);
            System.out.println("降水確率は" + rainyPercent + "％です。");
            if (rainyPercent > 100) {
                System.out.println("降水確率は0～100の間ですよ。");
            } else if (rainyPercent >= 50) {
                System.out.println("傘を忘れずにね。");
            } else {
                System.out.println("傘はいりません。");
            }
            System.out.println("いってらっしゃい。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません");
        }
    }
}
