package com.flipkart.learn.dayApril13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);


        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        list3.add(10);


        List<Integer> list4 = new ArrayList<>();
        list4.addAll(list1);
        list4.addAll(list2);
        list4.addAll(list3);
        System.out.println(list4);
        System.out.println(list4.contains(10));
        System.out.println(list4.containsAll(list1));
        System.out.println(list4.subList(3,7));
        System.out.println(list4.isEmpty());
        System.out.println(list4.remove(Integer.valueOf(3)));
        System.out.println(list4);
    }
}
