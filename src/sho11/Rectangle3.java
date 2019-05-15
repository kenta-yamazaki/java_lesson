package sho11;

/**
 * list11-3 幅と高さを指定する
 */
public class Rectangle3 {
    int width;
    int height;

    Rectangle3(int width, int height) {
        this.width = width;
        this.height = height;
        //setSize(width,height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }
}
