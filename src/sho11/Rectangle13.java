package sho11;

/**
 * list11-13 getAreaをクラスメソッドとして書く
 */
public class Rectangle13 {
    int width;
    int height;

    Rectangle13() {
        setSize(10, 20);
    }

    Rectangle13(int width, int height) {
        setSize(width, height);
    }

    static int getArea(Rectangle13 obj) {
        return obj.width * obj.height;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
