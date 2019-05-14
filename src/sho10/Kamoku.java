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
     * 科目名と点数を表現する文字列を返します
     *
     * @return 科目名と点数を表現する文字列
     */
    @Override
    public String toString() {
        return this.kamokuName + "は" + this.kamokuScore + "点";
    }
}
