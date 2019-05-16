package sho12;

/**
 * list12-3 コンストラクタは継承されない
 */
public class Rectangle3 {
    int width;
    int height;

    Rectangle3() {
        this.width = 0;
        this.height = 0;
    }

    Rectangle3(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class NamedRectangle3 extends Rectangle3 {
    String name;

    NamedRectangle3() {
        name = "NO NAME";
    }

    NamedRectangle3(String name) {
        this.name = name;
    }
}
