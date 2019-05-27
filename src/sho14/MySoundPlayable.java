package sho14;

/**
 * 問題14-4
 * 以下のMyMediaPlayableインタフェースを拡張して、<br>
 * MySoundPlayableという名前のサブインタフェースを宣言してください。<br>
 * 追加するメソッドはgetSoundNameです。<br>
 * String getSoundName();
 * <pre>{@code
 * interface  MyMediaPlayble{
 *     void play();
 *     void stop();
 *     void loop();
 * }
 * }<pre/>
 */
interface MySoundPlayble extends MyMediaPlayable {
    String getSoundName();
}
