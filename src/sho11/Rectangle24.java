package sho11;

/**
 * 問題11-9<br>
 * 本文中で宣言したRectangleクラスは、幅と高さを持つ長方形でした。<br>
 * これに「左上すみの位置」を表すxとyというフィールドを追加してください。そして、<br>
 * 以下のコンストラクタやメソッドを宣言してください。<br>
 * (1)フィールド<br>
 * (la)指定がない時の幅と高さ（INITIAL_WIDTH,INITIAL_HEIGHT）<br>
 * (2)コンストラクタ<br>
 * (2a)引数がないもの（width,heightの初期値はINITIAL_WIDTH,INITIAL_HEIGHT,xとyは0）<br>
 * (2b)width,heightだけを指定したもの（xとyは0）<br>
 * (2c)x,y,width,heightを指定するもの<br>
 * (3)メソッド<br>
 * (3a)位置を指定するvoid setLocation(int x, int y)メソッド<br>
 * (3b)大きさを指定するvoid setSize(int width, int height)メソッド<br>
 * (3c)[x,y,width,height]の形式で文字列として表現するtoStringメソッド<br>
 * (3d)長方形の「重なり部分」(これも長方形)を得るintersect(Rectangle r)メソッド<br>
 * ただし、重なりがない場合にはnullを返す<br>
 * <p>
 * 【注意】解答では、コンピュータグラフィクスで使われる座標系を使っています。<br>
 * この座標系では、原点（0,0）が左上にあると考え、x座標は右にいくほど大きくなり、<br>
 * y座標は下にいくほど大きくなります。
 */
public class Rectangle24 {
    final int INITIAL_WIDTH = 10;
    final int INITIAL_HEIGHT = 20;

    int width;
    int height;
    int x;
    int y;

    Rectangle24() {
        setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
        this.x = 0;
        this.y = 0;
    }

    Rectangle24(int width, int height) {
        setSize(width, height);
        this.x = 0;
        this.y = 0;
    }

    Rectangle24(int x, int y, int width, int height) {
        setSize(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + this.x + " ," + this.y + " ," + this.width + " ," + this.height + "]";
    }

    Rectangle24 intersct(Rectangle24 rectangle) {
        int startX = Math.max(this.x, rectangle.x);
        int startY = Math.max(this.y, rectangle.y);
        int endX = Math.min(this.x + this.width, rectangle.x + rectangle.width);
        int endY = Math.min(this.y + this.height, rectangle.y + rectangle.height);
        int newWidth = endX - startX;
        int newHeight = endY - startY;
        if (newWidth > 0 && newHeight > 0) {
            return new Rectangle24(startX, startY, newWidth, newHeight);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Rectangle24 a = new Rectangle24(0, 0, 20, 10);
        Rectangle24 b = new Rectangle24(5, 5, 20, 10);
        Rectangle24 c = new Rectangle24(20, 10, 20, 10);
        Rectangle24 d = new Rectangle24(-10, -20, 100, 200);
        Rectangle24 e = new Rectangle24(21, 11, 20, 10);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("a と a の重なり = " + a.intersct(a));
        System.out.println("a と b の重なり = " + a.intersct(b));
        System.out.println("a と c の重なり = " + a.intersct(c));
        System.out.println("a と d の重なり = " + a.intersct(d));
        System.out.println("a と e の重なり = " + a.intersct(e));
    }

}
