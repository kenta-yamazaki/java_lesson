package sho13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.MalformedInputException;

/**
 * list13-6 MalformedURLException
 */
public class DisplayURL {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("URL = " + arg);
            try {
                URL url = new URL(arg);
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    System.out.println(line);
                }
                reader.close();
            } catch (MalformedInputException e) {
                System.out.println("URLの形式が謝っています：" + e);
            } catch (IOException e) {
                System.out.println("I/Oエラーです：" + e);
            }
        }
    }
}
