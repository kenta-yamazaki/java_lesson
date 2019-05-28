package sho18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * list18-1 ファイルの内容を標準出力に表示する
 */
public class ShowFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法： Java ShowFile1 ファイル名");
            System.out.println("例： Java ShowFile1 ShowFile1.java");
            System.exit(0);
        }
        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
