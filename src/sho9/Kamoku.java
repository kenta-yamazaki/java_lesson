package sho9;

/**
 * 科目を表すクラス
 */
public class Kamoku {
    String kamokuName;  //科目名
    int kamokuTensu;    //点数

    //科目の作成
    public Kamoku(String kamokuName, int kamokuTensu) {
        this.kamokuName = kamokuName;
        this.kamokuTensu = kamokuTensu;
    }

    //科目の文字列表現
    @Override
    public String toString() {
        return this.kamokuName + "は" + this.kamokuTensu + "点";
    }
}
