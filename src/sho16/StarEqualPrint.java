package sho16;

/**
 * 問題16-6 約3秒ごとに"***"を10回表示するスレッドと、約5秒ごとに"====="を10回表示するスレッドを、<br>
 * それぞれ1つずつ動かすクラスをThreadクラスの拡張クラスとして作ってください。表示は下記のようになります。<br>
 */
public class StarEqualPrint {
    public static void main(String[] args) {
        new StarPrint().start();
        new EqualPrint().start();
    }
}
