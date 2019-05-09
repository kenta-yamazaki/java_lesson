package sho7;

/**
 * for文を使った下記のプログラムを、while文だけを使うように修正してください。<br>
 * また、このようなプログラムは何をするプログラムでしょう。
 * <pre>{@code
 * public class Graph1{
 *     public static void main(String[] args){
 *         for (int i = 0; i < 10; i++){
 *             for (int j = 0; j < i * i; j++){
 *                 System.out.print("*");
 *             }
 *             System.out.println("");
 *         }
 *     }
 * }
 * }</pre>
 */
public class Graph1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < Math.pow(i, 2)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*
    ループ回数の二乗個*を出力するプログラム。
 */
