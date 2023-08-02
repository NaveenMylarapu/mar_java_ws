package com.flipkart.learn.dayApril13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Iterator;
public class ArrayListExample2 {
    // Generate 20 random numbers store it in a container and display them.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int x = ThreadLocalRandom.current().nextInt(100,999);
            list.add(x);
        }
        System.out.println("Using for Loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("For Each Loop");
        System.out.println("Using List Iterator");
        Iterator<Integer> itr = list.iterator();
        System.out.println(list);
        while(itr.hasNext()) {
            int num = itr.next();
            if (num % 2 == 0)
                itr.remove();
            System.out.println(num);
        }
        System.out.println(list );
        ListIterator<Integer> listItr = list.listIterator();
        while(listItr.hasPrevious()) {
            int num = listItr.previous();
            if(num % 2 !=0)
                listItr.remove();
            System.out.println(num);
        }
        System.out.println(list);
    }
}
