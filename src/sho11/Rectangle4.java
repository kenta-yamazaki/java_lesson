package sho11;

/**
 * list11-4 コンストラクタの中からメソッドを呼び出してもよい
 */
public class Rectangle4 {
    int width;
    int height;

    Rectangle4(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }
}
