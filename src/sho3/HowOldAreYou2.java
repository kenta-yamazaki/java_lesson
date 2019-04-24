package sho3;

import java.io.*;

/**
 * 2人の名前と年齢を入力すると、その人たちの年齢の平均を表示するプログラムをかいてください。
 */
public class HowOldAreYou2 {
    public static void main(String[] args) {
        System.out.println("あなたの名前を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //１人目
            System.out.println("1人目の名前を入力してください。");
            String name1  = reader.readLine();
            System.out.println(name1 + "さんの年齢を入力してください。");
            String line = reader.readLine();
            int age1 = Integer.parseInt(line);
            //２人目
            System.out.println("2人目の名前を入力してください。");
            String name2 = reader.readLine();
            System.out.println(name2 + "さんの年齢を入力してください。");
            line = reader.readLine();
            int age2 = Integer.parseInt(line);
            //平均
            double average = (age1 + age2) / 2.0;
            System.out.println(name1 + "さんと" + name2 + "さんの年齢の平均は" + average + "です。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません。");
        }
    }
}
