package sho11;

/**
 * list11-7 これまでのRectangle.java ~ Rectangle6.javaにmainメソッドを追加する
 */
public class Rectangle7 {
    int width;
    int height;

    Rectangle7() {
        setSize(10, 20);
    }

    Rectangle7(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle7 rectangle1 = new Rectangle7();
        System.out.println("rectangle1.width = " + rectangle1.width);
        System.out.println("rectangle1.height = " + rectangle1.height);
        System.out.println("rectangle1.getArea() = " + rectangle1.getArea());

        Rectangle7 rectangle2 = new Rectangle7(123, 45);
        System.out.println("rectangle2.width = " + rectangle2.width);
        System.out.println("rectangle2.height = " + rectangle2.height);
        System.out.println("rectangle2.getArea() = " + rectangle2.getArea());
    }
}
