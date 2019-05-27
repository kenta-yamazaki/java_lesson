package sho16;

/**
 * 問題16-11 List16-6のGoodBankTestは、GoodBankのインスタンスを生成して、<br>
 * 預金の預け入れと引き出しを行いました。これを変更して銀行口座がたった１つしかないプログラムにしてください。<br>
 * クラスの名前はOneBankTestとOneBankにすること。
 */
public class OneBank {
    private static int value = 0;

    public static synchronized void addMoney(int money) {
        int currentValue = value;
        System.out.println(Thread.currentThread() + "が addMoney に入りました。");
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました！");
            System.exit(-1);
        }
        System.out.println(Thread.currentThread() + "が addMoney から出ました。");
    }
}
