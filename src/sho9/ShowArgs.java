package sho9;

/**
 * コマンドラインの引数を表示する
 */
public class ShowArgs {
    public static void main(String[] args) {
        System.out.println("args.lengthの値は" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "j の値は " + args[i] + " です。");
        }
    }
}
