package sho19;

import java.util.ArrayList;

/**
 * list19-2<br>
 * list19-1 と同じ処理をArrayListを使って実現
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
