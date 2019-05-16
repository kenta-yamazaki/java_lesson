package sho12;

/**
 * スーパークラスのコンストラクタの呼び出し
 */
public class Rectangle6 {
    int width;
    int height;

    Rectangle6() {
        this.width = 0;
        this.height = 0;
    }

    Rectangle6(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class NamedRectangle6 extends Rectangle6 {
    String name;

    NamedRectangle6() {
        super();

        name = "NO NAME";
    }

    NamedRectangle6(String name) {
        super(200, 32);

        this.name = name;
    }
}
