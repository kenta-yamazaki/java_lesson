package sho18;

import java.io.File;

/**
 * ファイルを削除する
 */
public class DeleteFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法： java DeleteFile1 削除ファイル");
            System.out.println("使用法： java DeleteFile1 trash.txt");
            System.exit(0);
        }
        String fileName = args[0];
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(fileName + "を削除しました。");
        } else {
            System.out.println(fileName + "は削除出来ませんでした。");
        }
    }
}
