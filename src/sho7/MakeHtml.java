package sho7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力から1行ずつ読み取って、以下のルールにしたがって処理を行い、標準出力に出すプログラムMakeHtmlを作ってください。<br>
 * * ・ルール１（開始）:<br>
 * 　最初に一度だけ、以下の6行を出力する。<br>
 * <pre>{@code
 *   <!DOCTYPE html>
 *   <html>
 *   <head>
 *   <title>My Page</title>
 *   </head>
 *   <body>
 *  }</pre>
 * ・ルール２（終了）：<br>
 * 標準入力が終わったら、最後に以下の2行を出力する。<br>
 * <pre>{@code
 *   </body>
 *   </html>
 * }</pre>
 * ・ルール３（見出し１）：<br>
 * 　入力行が"■"で始まっていたら、■を取り除いた残りの文字列を"<h1>"と"</h1>"ではさんで改行付きで出力する。<br>
 * ・ルール４（見出し２）：<br>
 * 　入力行が"●"で始まっていたら、●を取り除いた残りの文字列を"<h2>"と"</h2>"ではさんで改行付きで出力する。<br>
 * ・ルール５（段落）：<br>
 * 　入力行がルール３にも４にも当てはまらないなら、入力行を"<p>"と"</p>"ではさんで改行付きで出力する。
 */
public class MakeHtml {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>My Page</title>");
            System.out.println("</head>");
            System.out.println("<body>");
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("■")) {
                    System.out.println("<h1>" + line.substring(1) + "</h1>");
                } else if (line.startsWith("●")) {
                    System.out.println("<h2>" + line.substring(1) + "<h2>");
                } else {
                    System.out.println("<p>" + line + "</p>");
                }
            }
            System.out.println("</body>");
            System.out.println("</html>");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
