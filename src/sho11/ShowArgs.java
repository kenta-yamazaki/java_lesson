package sho11;

/**
 * list11-14 コマンドラインで与えられた引数を表示する
 */
public class ShowArgs {
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
