package sho11;

/**
 * list11-9 クラスフィールドを使ってインスタンスに番号をつける
 */
public class Rectangle9 {
    int width;
    int height;
    static int counter = 0;
    int number;

    Rectangle9() {
        setSize(10, 20);
        number = counter;
        counter++;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
