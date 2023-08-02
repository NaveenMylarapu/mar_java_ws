package com.flipkart.learn.dayApril13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(6);
        arrList.add(null);
      //  System.out.println(arrList);
        //arrList.remove(5);
        //System.out.println(arrList);
        //arrList.remove(2);
       // System.out.println(arrList);
      //  arrList.remove(2  );
        //System.out.println(arrList);

        List<String> arrList2 = new ArrayList<>();
        arrList2.add("Naveen");
        arrList2.add("Ramu");
        arrList2.add("rakesh");
        arrList2.add("ravi");
        for(int  i= 0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }
        System.out.println(arrList2.get(1).toUpperCase());
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("Naveen");
        list.add("Rahul");
        list.add("sai");
        System.out.println(list);

    }
}
