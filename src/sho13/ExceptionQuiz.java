package sho13;

/**
 * 問題13-5 なんと表示されますか
 */
public class ExceptionQuiz {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            int[] array = new int[3];
            System.out.println("代入します");
            array[3] = 123;
        } catch (RuntimeException e) {
            System.out.println("catch(1)");
        } catch (Exception e) {
            System.out.println("catch(2)");
        } finally {
            System.out.println("finally");
        }
        System.out.println("END");
    }
}
