package sho11;

/**
 * list11-10 クラスメソッドの宣言
 */
public class Rectangle10 {
    int width;
    int height;
    static int counter = 0;
    int number;

    Rectangle10() {
        setSize(10, 20);
        number = counter;
        counter++;
    }

    static int getCounter() {
        return counter;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
