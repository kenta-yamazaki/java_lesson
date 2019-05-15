package sho11;

/**
 * toStringメソッド
 */
public class Rectangle17 {
    int width;
    int height;

    Rectangle17(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[ width = " + width + ", height = " + height + " ]";
    }
}
