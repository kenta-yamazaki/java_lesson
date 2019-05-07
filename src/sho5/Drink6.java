package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>{@code
 * switch(c){
 *     case '1':
 *     case 'a':
 *         System.out.println("オレンジジュースです");
 *         break;
 *
 *     case '2':
 *     case 'b':
 *         System.out.println("コーヒーです");
 *         break;
 *
 *     default:
 *         System.out.println("どちらでもありません");
 *         break;
 * }
 * }<pre/>
 */
public class Drink6 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("1 オレンジジュース(a)");
            System.out.println("2 コーヒー(b)");
            System.out.println("3 どれでもありません(c)");
            System.out.println("1,2,3のどれかを選んでください（a,b,cでも選べます）。");
            String line = reader.readLine();
            char userSelectMoji = line.charAt(0);
            if (userSelectMoji == '1' || userSelectMoji == 'a') {
                System.out.println("オレンジジュースです");
            } else if (userSelectMoji == '2' || userSelectMoji == 'b') {
                System.out.println("コーヒーです");
            } else {
                System.out.println("どちらでもありません");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
