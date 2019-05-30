package sho19;

import java.util.LinkedList;

/**
 * list19-9 LinkedListを使ってAliceを先頭に挿入するサンプル
 */
public class LinkedListTest1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Bob");
        list.add("Chris");
        list.add("Diane");
        list.add("Elmo");

        System.out.println(list);

        list.addFirst("Alice");

        System.out.println(list);
    }
}
