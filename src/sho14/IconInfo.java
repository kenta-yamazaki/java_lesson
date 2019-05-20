package sho14;

import java.awt.*;

/**
 * 問題
 * 次のメソッドとフィールドを持つ、IconInfoというpublicなインタフェースを宣言してください。<br>
 * ・引数はint型で仮引数の名前はiconType,戻り値の型はimage型で、名前がgetIconであるメソッド<br>
 * ・型はintで名前はICON_16X16、値は1であるフィールド
 * ・型はintで名前はICON_32X32、値は2であるフィールド
 */
interface IconInfo {
    static final int ICON_16X16 = 1;
    static final int ICON_32X32 = 2;
    Image getIcon(int iconType);
}
