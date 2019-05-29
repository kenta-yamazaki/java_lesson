package sho18;

import java.io.*;

/**
 * 問題18-2<br>
 * ファイル中に特定の文字列を含んでいるかどうかを調べるプログラムFindFile1を作ってください。<br>
 * 起動のときの引数は、 java FindFile1 検索文字列 検索対象ファイル<br>
 * のようにして、文字列が見つかったらその行の行番号と、その行のそのものを表示してください。<br>
 * 実行結果例は下記のようになります。上巻p167のFind1を参考にしてください。
 * <pre>{@code
 * KentanoMacBook-Pro:src kenta-yamazaki$ javac -encoding utf-8 sho18/FindFile1.java
 * KentanoMacBook-Pro:src kenta-yamazaki$ java sho18.FindFile1 System sho18/FindFile1.java
 * 15：            System.out.println("使用法： java FindFile1 検索文字列 検索対象ファイル");
 * 16：            System.out.println("例： java FindFile1 System FindFile1.java");
 * 17：            System.exit(0);
 * 27：                    System.out.println(lineNumber + "：" + line);
 * 32：            System.out.println(fileName + "が見つかりません。");
 * 34：            System.out.println(e);
 * }<pre/>
 */
public class FindFile1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法： java FindFile1 検索文字列 検索対象ファイル");
            System.out.println("例： java FindFile1 System FindFile1.java");
            System.exit(0);
        }
        String findString = args[0];
        String fileName = args[1];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                int number = line.indexOf(findString);
                if (number >= 0) {
                    System.out.println(lineNumber + "：" + line);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
