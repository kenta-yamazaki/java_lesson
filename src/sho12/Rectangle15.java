package sho12;

/**
 * 問題12-4<br>
 * 次の機能を持つPlacedRectangleを、Rectangleのサブクラスとして宣言する。<br>
 * ・位置を表すint型のフィールドx,yを持つ<br>
 * （1）引数なし<br>
 * （2）位置付き<br>
 * （3）位置と大きさ付き<br>
 * ・位置を変更するメソッドsetLocationを持つ<br>
 * ・標準的な文字列表現を返すメソッドtoStringを持つ<br>
 * x = 12, y = 34, width = 123, height = 45のとき、<br>
 * [(12, 34) [123, 45]]となるものとする。<br>
 * ただし、Rectangleクラスは下記のように宣言されているとする。<br>
 *
 * <pre>{@code
 * public class Rectangle15 {
 *     int width;
 *     int height;
 *     Rectangle15(){
 *         setSize(0,0);
 *     }
 *     Rectangle15(int width,int height){
 *         setSize(width,height);
 *     }
 *     void setSize(int width,int height){
 *         this.width = width;
 *         this.height = height;
 *     }
 *     @Override
 *     public String toString(){
 *         return "[" + width +", " + height + "]";
 *     }
 * }
 * }<pre/>
 */
public class Rectangle15 {
    int width;
    int height;

    Rectangle15() {
        setSize(0, 0);
    }

    Rectangle15(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + width + ", " + height + "]";
    }
}

class PlacedRectangle15 extends Rectangle15 {
    int x;
    int y;

    PlacedRectangle15() {
        super();
        setLocation(0, 0);
    }

    PlacedRectangle15(int x, int y) {
        setLocation(x, y);
    }

    PlacedRectangle15(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);

    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + this.x + ", " + this.y + " )" + super.toString() + "]";
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
