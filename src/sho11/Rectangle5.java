package sho11;

/**
 * list11-5 引数なしコンストラクタ
 */
public class Rectangle5 {
    int width;
    int height;

    Rectangle5() {
        setSize(10, 20);
    }

    Rectangle5(int width, int height) {
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
