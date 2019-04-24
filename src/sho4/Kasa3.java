package sho4;

import java.io.*;

/**
 * 傘プログラムの完成。<br>
 * list4-2の問題点<br>
 * 「降水確率が0より小さいときに、誤った入力であることをユーザーに知らせてくれない。」<br>
 * の改善。
 */
public class Kasa3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("降水確率を入力してください。");
            String line = reader.readLine();
            int rainy_per = Integer.parseInt(line);
            System.out.println("降水確率は" + rainy_per + "％です。");
            if (rainy_per < 0 || 100 < rainy_per) {
                System.out.println("降水確率は0～100の間ですよ。");
            } else if (rainy_per >= 50) {
                System.out.println("傘を忘れずにね。");
            } else {
                System.out.println("傘はいりません。");
            }
            System.out.println("いってらっしゃい。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }

}
