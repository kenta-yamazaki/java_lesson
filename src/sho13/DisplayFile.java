package sho13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * list13-5 IOException
 */
public class DisplayFile {
    public static void main(String[] args) {
        for (String fileName : args) {
            System.out.println("ファイル名 " + fileName + "====");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    System.out.println(line);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("ファイルが見つかりません：" + e);
            } catch (IOException e) {
                System.out.println("I/Oエラーです：" + e);
            }
        }
    }
}
