package com.flipkart.learn.dayApril13;
import java.util.Map;
import java.util.HashMap;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Naveen");
        map.put(2,"Mailarapu");
        map.put(3,"A");
        map.put(4,"B");
        map.put(4,"C");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        map.put(5,"five");
        System.out.println(map);
    }
}
