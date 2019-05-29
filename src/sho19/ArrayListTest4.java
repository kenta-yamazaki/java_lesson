package sho19;

import java.util.ArrayList;

/**
 * イテレータが隠された拡張forループ
 */
public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        for (String name : list) {
            System.out.println(name);
        }
    }
}
