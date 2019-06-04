package sho19;

import java.util.ArrayList;

/**
 * list19-6 intをArrayListで管理する例
 */
public class ArrayListTest5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(34);
        list.add(78);
        list.add(90);

        for (int number : list) {
            System.out.println(number);
        }
    }
}
