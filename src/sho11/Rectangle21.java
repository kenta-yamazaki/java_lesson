package sho11;

/**
 * list11-21 引数を１つにしてください
 */
public class Rectangle21 {
    int width;
    int height;

    Rectangle21(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Rectangle21 rectangle) {
        if (rectangle == null) {
            return false;
        }
        return width == rectangle.width && height == rectangle.height;
    }
}
