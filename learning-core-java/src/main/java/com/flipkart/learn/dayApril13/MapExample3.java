package com.flipkart.learn.dayApril13;
import java.util.HashMap;
import java.util.Map;
// To find how many times the string repeats in a sentence Learning java is fun  to have fun learn java
public class MapExample3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String data = "Learning java is fun  to have fun learn java";
        String arr[]  = data.split(" ");
        for(String str:arr){
            map.putIfAbsent(str,0);
            map.put(str,map.get(str)+1);
        }
        System.out.println(map);

    }

}
