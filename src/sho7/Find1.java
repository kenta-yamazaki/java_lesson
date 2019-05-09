package sho7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文字列の検索
 */
public class Find1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法:Java Find1 検索文字列 < 検索対象ファイル");
            System.out.println("例：Java Find1 System < Find1.java");
            System.exit(0);
        }
        String findString = args[0];
        System.out.println("検索文字列は「" + findString + "」です。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                int n = line.indexOf(findString);
                if (n >= 0) {
                    System.out.println(lineNumber + ":" + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
