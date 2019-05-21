package sho12;

/**
 * list12-8 メソッドのオーバーライド
 */
public class Rectangle8 {
    int width;
    int height;

    Rectangle8() {
        this.width = 0;
        this.height = 0;
    }

    Rectangle8(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class NamedRectangle8 extends Rectangle8 {
    @Override
    void setSize(int width, int height) {
        this.width = width + 10;
        this.height = height + 10;
    }
}
