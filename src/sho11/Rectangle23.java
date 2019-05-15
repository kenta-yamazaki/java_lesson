package sho11;

/**
 * 問題11-8
 * widthとheightがマイナスになるなら、<br>
 * 強制的に0にしてしまう修正をしたいとします。<br>
 * クラス宣言のどの部分に、どのように修正を入れたらよいでしょうか。
 */
public class Rectangle23 {
    int width;
    int height;

    Rectangle23() {
        setSize(10, 20);
    }

    Rectangle23(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle23 rectangle1 = new Rectangle23();
        System.out.println("rectangle1.width = " + rectangle1.width);
        System.out.println("rectangle1.height = " + rectangle1.height);
        System.out.println("rectangle1.getArea() = " + rectangle1.getArea());

        Rectangle23 rectangle2 = new Rectangle23(-123, -45);
        System.out.println("rectangle2.width = " + rectangle2.width);
        System.out.println("rectangle2.height = " + rectangle2.height);
        System.out.println("rectangle2.getArea() = " + rectangle2.getArea());
    }
}
