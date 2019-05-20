package sho11;

/**
 * Rectangle~Rectangle24クラスの実行結果を確認するテストクラス
 */
public class RectangleTest {
    public static void main(String[] args) {
        /* list11-1
        Rectangle r = new Rectangle();
        r.setSize(10,5);
        System.out.println("長方形の面積は、"+r.getArea()+"㎠です。");
        */

        /* list11-3 list11-4
        Rectangle3 r = new Rectangle3(10,5);
        System.out.println("長方形の面積は、"+r.getArea()+"㎠です。");
        r.setSize(20,10);
        System.out.println("長方形の面積は、"+r.getArea()+"㎠です。");
        */

        /* list11-5 list11-6 list11-12
        Rectangle12 r = new Rectangle12();
        System.out.println("長方形の面積は、"+r.getArea()+"㎠です。");
        */

        /* list11-9
        Rectangle9 r = new Rectangle9();
        System.out.println("あなたの番号は、" + r.number + "番です。");
        Rectangle9 r2 = new Rectangle9();
        System.out.println("あなたの番号は、" + r2.number + "番です。");
        */

        /* list11-10
        Rectangle10 r = new Rectangle10();
        System.out.println("あなたの番号は、" + r.number + "番です。");
        Rectangle10 r2 = new Rectangle10();
        System.out.println("あなたの番号は、" + r2.number + "番です。");

        System.out.println("作成された長方形は全部で、" + Rectangle10.getCounter() + "個です。");
        */

        /* list11-13
        Rectangle13 r = new Rectangle13();
        Rectangle13 r2 = new Rectangle13(100,5);
        System.out.println("長方形の面積は、"+Rectangle13.getArea(r)+"㎠です。");
        System.out.println("長方形の面積は、"+Rectangle13.getArea(r2)+"㎠です。");
         */

        /* list11-15
        Rectangle15 r = new Rectangle15();
        System.out.println("r.width = " + r.width);
        System.out.println("r.height = " + r.height);
         */

        /* list11-17
        Rectangle17 r = new Rectangle17(50,10);
        System.out.println(r);
        */

        /* list11-21
        Rectangle21 r = new Rectangle21(50,10);
        Rectangle21 r2 = new Rectangle21(50,10);
        System.out.println(r.equals(r2));
        */

        /* list
        Rectangle22 r = new Rectangle22(123, 45);
        System.out.println(r);
         */
    }
}
