package sho9;

/**
 * 番号指定のあいさつプログラムを完成させましょう。
 */
public class SelectGreeting {
    public static void main(String[] args) {
        String[] message = {"おはよう！", "こんにちは！", "こんばんは！"};
        if (args.length != 1) {
            System.out.println("使い方：Java SelectGreeting 番号");
            System.exit(0);
        }
        int number = Integer.parseInt(args[0]);
        if (0 <= number && number < message.length) {
            System.out.println(message[number]);
        } else {
            System.out.println("番号は0〜" + (message.length - 1) + "選び範囲で指定してください。");
        }
    }
}
