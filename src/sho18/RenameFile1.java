package sho18;

import java.io.File;

/**
 * list18-4 ファイルの名前を変更する１
 */
public class RenameFile1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法： java RenameFile1 現在のファイル名 新しいファイル名");
            System.out.println("例： java RenameFile1 old.txt new.txt");
            System.exit(0);
        }
        String oldFileName = args[0];
        String newFileName = args[1];
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);
        if (oldFile.renameTo(newFile)) {
            System.out.println(oldFileName + "を" + newFileName + "に変更しました。");
        } else {
            System.out.println(oldFileName + "を" + newFileName + "に変更できませんでした。");
        }
    }
}
