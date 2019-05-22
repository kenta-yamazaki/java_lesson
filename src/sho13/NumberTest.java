package sho13;

/**
 * list13-4 NumberFormatException
 */
public class NumberTest {
    public static void main(String[] args) {
        try {
            String numberString = "XYZ";
            int val = Integer.parseInt(numberString);
            System.out.println("val = " + val);
        } catch (NumberFormatException e) {
            System.out.println("例外:" + e);
        }
    }
}
