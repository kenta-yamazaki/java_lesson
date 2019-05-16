package sho12;

/**
 * list12-11 抽象クラス
 */
abstract class Player {
    public abstract void play();

    public void loop(int count) {
        for (int i = 0; i < count; i++) {
            play();
        }
    }
}
