package sho7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 下記は何をするプログラムですか。また、continue文を使わない形式に書き換えてください。
 *
 * <pre>{@code
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 * public class ContinueTest {
 *     public static void main(String[] args) {
 *         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 *         try {
 *             String line;
 *             while ((line = reader.readLine()) != null) {
 *                 if (!line.endsWith("{") && !line.endWith("}")) {
 *                     continue;
 *                 }
 *                 System.out.println(line);
 *             }
 *         }catch (IOException e) {
 *             System.out.println(e);
 *         }
 *     }
 * }
 * }</pre>
 * 何をするプログラム？
 */
public class ContinueTest {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("{") || line.endsWith("}")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
/*
    入力した文字列の終わりがが"{"か"}"の時、出力するプログラム
 */
