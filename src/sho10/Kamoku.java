package sho10;

/**
 * toStringを宣言する
 */
public class Kamoku {
    /** 科目名 */
    String kamokuName;
    /** 科目の点数 */
    int kamokuScore;

    /**
     * コンストラクタ
     *
     * @param kamokuName  科目名
     * @param kamokuScore 科目の点数
     */
    public Kamoku(String kamokuName, int kamokuScore) {
        this.kamokuName = kamokuName;
        this.kamokuScore = kamokuScore;
    }

    /**
     * 科目の文字列を出力
     *
     * @return 科目と科目点数を反映させた文字列
     */
    @Override
    public String toString() {
        return this.kamokuName + "は" + this.kamokuScore + "点";
    }
}
