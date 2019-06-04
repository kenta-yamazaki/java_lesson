package sho19;

import java.util.ArrayList;

/**
 * removeメソッドとcontainsメソッドの例
 */
public class ArrayListTest6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        System.out.println("削除の前");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        list.remove("Alice");
        list.remove("Bob");
        list.remove("Elmo");

        System.out.println("削除の後");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        if (list.contains("Alice")) {
            System.out.println("listにAliceは含まれています。");
        } else {
            System.out.println("listにAliceは含まれていません。");
        }
    }
}
