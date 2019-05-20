package sho14;

class MyNumber implements DebugPrintable {
    int number;

    public MyNumber(int number) {
        this.number = number;
    }

    @Override
    public void debugPrint() {
        System.out.println("MyNumberのインスタンス：numberの値は " + number + "です。");
    }
}
