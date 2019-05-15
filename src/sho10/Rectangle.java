package sho10;

/**
 * 次のような「長方形」クラスを宣言してください。<br>
 * ・クラスの名前はRectangle<br>
 * ・「幅」を表すint型のフィールドwidhthを持つ<br>
 * ・「高さ」を表すint型のフィールドheightを持つ<br>
 * ・幅と高さを指定するコンストラクタを持つ<br>
 * ・幅が123で高さが45の時に、[ 123 , 45 ]<br>
 * という文字列を得るためのtoStringメソッドを持つ
 */
public class Rectangle {
    /** 長方形の幅 */
    int width;
    /** 長方形の高さ */
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[ " + this.width + ", " + this.height + " ]";
    }
}
