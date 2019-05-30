package sho19;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * list19-12 LinkedListをスタックとして用いたサンプル
 */
public class LinkedListTest4 {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        stack.addFirst("Alice");
        System.out.println("offer後のstack = " + stack);
        stack.addFirst("Bob");
        System.out.println("offer後のstack = " + stack);
        stack.addFirst("Chris");
        System.out.println("offer後のstack = " + stack);
        stack.addFirst("Diana");
        System.out.println("offer後のstack = " + stack);
        stack.addFirst("Elmo");
        try {
            while (true) {
                String name = stack.getFirst();
                System.out.println("getFirstの戻り値 = " + name);

                name = stack.removeFirst();
                System.out.println("removeFirstの戻り値 = " + name);
                System.out.println("removeFirst後のstack = " + stack);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
