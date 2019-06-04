package sho19;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * LinkedListをキューとして用いたサンプル
 */
public class LinkedListTest3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        System.out.println("offer後のqueue = " + queue);
        queue.add("Bob");
        System.out.println("offer後のqueue = " + queue);
        queue.add("Chris");
        System.out.println("offer後のqueue = " + queue);
        queue.add("Diana");

        try {
            while (true) {
                String name = queue.element();
                System.out.println("elementの戻り値 = " + name);

                name = queue.remove();
                System.out.println("removeの戻り値 = " + name);
                System.out.println("remove後のqueue = " + queue);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
