package sho18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * 標準入力の内容をファイルに書き込む
 */
public class WriteFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法： Java WriteFile1 作成ファイル");
            System.out.println("例： Java WriteFile1 output.txt < input.txt");
            System.exit(0);
        }
        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
