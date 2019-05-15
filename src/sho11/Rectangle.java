package sho11;

/**
 * list11-1 メソッドを宣言する
 */
public class Rectangle {
    int width;
    int height;

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }
}
