package com.flipkart.learn.dayApril13;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "Naveen");
        map.put(6, "Ramu");
        System.out.println(map);
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        Collection<String> values = map.values();
        System.out.println(values);
        Set<Map.Entry<Integer, String>> entryset = map.entrySet();
        for (Map.Entry<Integer, String> entry:entryset){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
        map.isEmpty();
        map.remove(4);
        map.putIfAbsent(8,"Rani");
        System.out.println(map);
    }
}
