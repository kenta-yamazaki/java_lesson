package sho11;

/**
 * 問題11-7 widthフィールド123で、heightフィールドが45<br>
 * であるようなRectangle22のインスタンスを表示したとき、<br>
 * Rectangle(123, 45)<br>
 * と表示されるようにしたいとします。どのようにプログラミングすればよいですか。
 */
public class Rectangle22 {
    int width;
    int height;

    Rectangle22(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + ", " + height + ")";
    }
}
