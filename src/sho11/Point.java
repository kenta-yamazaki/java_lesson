package sho11;

/**
 * list11-19 コンパイルエラーになるのはなぜか
 *
 * <pre>{@code
 * public class Point {
 *     int x;
 *     int y;
 *     static void setPosition(int x, int y){
 *         this.x = x;
 *         this.y = y;
 *     }
 * }
 * }<pre/>
 */
public class Point {
    int x;
    int y;

    void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
/*
    クラスフィールド内でインスタンスフィールドを扱っているため
 */
