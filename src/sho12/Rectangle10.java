package sho12;

/**
 * アクセスメソッド
 */
public class Rectangle10 {
    private int width;
    private int height;

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class NamedRectangle10 extends Rectangle10 {
    void goodMethod() {
        setSize(456, 78);
        System.out.println(getHeight());
    }

    public static void main(String[] args) {
        NamedRectangle10 nr10 = new NamedRectangle10();
        nr10.goodMethod();
    }

}
