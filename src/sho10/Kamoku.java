package sho10;

/**
 * toStringを宣言する
 */
public class Kamoku {
    String kamokuName;  //科目名
    int kamokuScore;    //点数

    //コンストラクタ
    public Kamoku(String kamokuName, int kamokuScore) {
        this.kamokuName = kamokuName;
        this.kamokuScore = kamokuScore;
    }

    //科目の文字列表現
    @Override
    public String toString() {
        return this.kamokuName + "は" + kamokuScore + "点";
    }
}
