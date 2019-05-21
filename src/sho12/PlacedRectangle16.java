package sho12;

/**
 * 問題12-5<br>
 * 問題12-4のPlacedRectangleを、Rectangleのサブクラスとしてではなく、<br>
 * Rectangle型のインスタンス変数をもつクラスとして宣言してください。
 */
public class PlacedRectangle16 {
    Rectangle15 rectangle15;
    int x;
    int y;

    PlacedRectangle16() {
        rectangle15 = new Rectangle15();
        setLocation(0, 0);
    }

    PlacedRectangle16(int x, int y) {
        rectangle15 = new Rectangle15();
        setLocation(x, y);
    }

    PlacedRectangle16(int x, int y, int width, int height) {
        rectangle15 = new Rectangle15(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + this.x + ", " + this.y + " )" + rectangle15 + "]";
    }

    public static void main(String[] args) {

        PlacedRectangle15 rectangle1 = new PlacedRectangle15();
        PlacedRectangle15 rectangle2 = new PlacedRectangle15(12, 34);
        PlacedRectangle15 rectangle3 = new PlacedRectangle15(31, 41, 59, 26);
        PlacedRectangle15 rectangle4 = new PlacedRectangle15(1, 2, 100, 200);
        rectangle4.setLocation(3, 4);
        System.out.println("rectangle1 = " + rectangle1);
        System.out.println("rectangle2 = " + rectangle2);
        System.out.println("rectangle3 = " + rectangle3);
        System.out.println("rectangle4 = " + rectangle4);
    }
}
