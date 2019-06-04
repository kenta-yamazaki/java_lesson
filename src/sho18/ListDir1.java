package sho18;

import java.io.File;

/**
 * list18-6 ディレクトリの一覧を得る
 */
public class ListDir1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法： java ListDir1 ディレクトリ名");
            System.out.println("例： java ListDir1 doc");
            System.exit(0);
        }
        String dirName = args[0];
        File dir = new File(dirName);
        String[] dirList = dir.list();
        for (int i = 0; i < dirList.length; i++) {
            System.out.println(dirList[i]);
        }
    }
}
