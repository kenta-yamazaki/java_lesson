package sho18;

import java.io.File;

/**
 * list18-7 ディレクトリを作成する
 */
public class MakeDir1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法： java MakeDir1 ディレクトリ名");
            System.out.println("例： java MakeDir1 doc");
            System.exit(0);
        }
        String dirName = args[0];
        File dir = new File(dirName);
        if (dir.mkdirs()) {
            System.out.println(dirName + "を作成しました。");
            System.out.println("絶対パスは" + dir.getAbsolutePath() + "です。");
        } else {
            System.out.println(dirName + "を作成できませんでした。");
        }
    }
}
