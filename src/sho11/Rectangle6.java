package sho11;

/**
 * list11-6 フィールドなしの初期化
 */
public class Rectangle6 {
    int width = 20;
    int height = 20;

    Rectangle6() {
        setSize(10, 20);
    }

    Rectangle6(int width, int height) {
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
