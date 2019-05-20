package sho11;

/**
 * 問題11-5
 * [player:Mad Htter]<br>
 * [player:March Hare]<br>
 * [player:Alice]<br>
 * と3人別々の名前が出ると思っていたのに、下記のように<br>
 * 3人とも[player:Alice]という名前になっています。なぜでしょうか？
 *
 * <pre>{@code
 * public class GamePlayer {
 *     public static String playerName;
 *
 *     public GamePlayer(String name) {
 *         playerName = name;
 *     }
 *
 *     @Override
 *     public String toString() {
 *         return "[player:" + playerName + "]";
 *     }
 *
 *     public static void main(String[] args) {
 *         GamePlayer[] player = new GamePlayer[3];
 *         player[0] = new GamePlayer("Mad Hatter");
 *         player[1] = new GamePlayer("March Hare");
 *         player[2] = new GamePlayer("Alice");
 *         for (int i = 0; i < player.length; i++) {
 *             System.out.println(player[i]);
 *         }
 *     }
 * }
 * }<pre/>
 */
public class GamePlayer {
    public String playerName;

    public GamePlayer(String name) {
        playerName = name;
    }

    @Override
    public String toString() {
        return "[player:" + playerName + "]";
    }

    public static void main(String[] args) {
        GamePlayer[] player = new GamePlayer[3];
        player[0] = new GamePlayer("Mad Hatter");
        player[1] = new GamePlayer("March Hare");
        player[2] = new GamePlayer("Alice");
        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i]);
        }
    }
}
/*
 * playerNameはクラス変数で、他のインスタンスが作られる度にplayerNameが最新のものに上書きされてしまうため。
 */
