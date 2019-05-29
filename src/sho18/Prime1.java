package sho18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 問題18-9<br>
 * 素数表作成プログラムを完成させてください<br>
 * ファイルの名前を指定すると、そのファイルに1000より小さい素数の表を書き出すプログラムですが、まだ作りかけです。<br>
 * java Prime1 prime.txt<br>
 * のように実行すると、prime.txtの内容は下記のようになる予定です。
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 * ・・・中略・・・
 * 953
 * 967
 * 971
 * 977
 * 983
 * 991
 * 997
 */
public class Prime1 {
    static final int MAX_PRIME = 1000;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法： java Prime1 作成ファイル");
            System.out.println("例： java Prime1 prime.txt");
            System.exit(0);
        }
        String fileName = args[0];
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            writerPrime(writer);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writerPrime(PrintWriter writer) {
        boolean[] prime = new boolean[MAX_PRIME];
        for (int i = 0; i < MAX_PRIME; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 0; i < MAX_PRIME; i++) {
            if (prime[i]) {
                writer.println(i);
                for (int j = 2; j * i < MAX_PRIME; j++) {
                    prime[j * i] = false;
                }
            }
        }
    }
}
