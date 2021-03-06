package sho13;

/**
 * 問題13-4 下記の誤りを直してください
 *
 * <pre>{@code
 * public class FactorialTest {
 *     public static void main(String[] args) {
 *         System.out.println(factorial(10));
 *     }
 *
 *     public static int factorial(int n) {
 *         return n * factorial(n - 1);
 *     }
 * }
 * }<pre/>
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("負の値は指定できません。");
        }
        return n > 0 ? n * factorial(n - 1) : 1;
    }
}
