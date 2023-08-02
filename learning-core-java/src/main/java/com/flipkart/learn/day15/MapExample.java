package com.flipkart.learn.day15;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Naveen");
        map.put(2,"Ramu");
        map.put(3,"Raju");
        System.out.println(map);
    }
}
