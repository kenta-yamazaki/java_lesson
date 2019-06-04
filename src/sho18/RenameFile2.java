package sho18;

import java.io.File;

/**
 * ファイルの名前を変更する2
 */
public class RenameFile2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法： java RenameFile2 現在のファイル名 新しいファイル名");
            System.out.println("例： java RenameFile2 old.txt new.txt");
            System.exit(0);
        }
        String oldFileName = args[0];
        String newFileName = args[1];
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);
        if (!oldFile.exists()) {
            System.out.println(oldFileName + "が見つかりません。");
        } else if (newFile.exists()) {
            System.out.printf(newFileName + "はすでに存在します。");
        } else if (oldFile.renameTo((newFile))) {
            System.out.println(oldFileName + "を" + newFileName + "に変更しました。");
        } else {
            System.out.println(oldFileName + "を" + newFileName + "に変更できませんでした。");
        }
    }
}
