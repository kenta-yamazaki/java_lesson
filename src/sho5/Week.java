package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * はじめに、「0～6の数字を入力してください。<br>
 * 対応した曜日を表示します。」と表示し、<br>
 * キーボードから0～6の数字を入力すると、<br>
 * その数字に応じて「日曜日」「月曜日」…「土曜日」と表示して<br>
 * 終了するプログラムを作ってください。<br>
 * 0～6以外の数字の入力があった場合には、「0～6の範囲で入力してください」と表示して終了とします。<br>
 * また、数字以外の入力があった場合には「数字を入力してください」<br>
 * と表示して終了するとします。
 */
public class Week {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("0～6の数字を入力してください。対応した曜日を表示します。");
            System.out.println("0 日曜日");
            System.out.println("1 月曜日");
            System.out.println("2 火曜日");
            System.out.println("3 水曜日");
            System.out.println("4 木曜日");
            System.out.println("5 金曜日");
            System.out.println("6 土曜日");
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            switch (number) {
                case 0:
                    System.out.println("日曜日です。");
                    break;

                case 1:
                    System.out.println("月曜日です。");
                    break;

                case 2:
                    System.out.println("火曜日です。");
                    break;

                case 3:
                    System.out.println("水曜日です。");
                    break;

                case 4:
                    System.out.println("木曜日です。");
                    break;

                case 5:
                    System.out.println("金曜日です。");
                    break;

                case 6:
                    System.out.println("土曜日です。");
                    break;

                default:
                    System.out.println("0～6の範囲で入力してください。");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
        }
    }
}
