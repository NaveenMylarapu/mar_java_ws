package com.flipkart.learn.day11;

public class PreandPostIncr {

    public static int preIncr(int a){
        return a++;
    }
    public static int postIncr(int a){
        return ++a;
    }
    public static void main(String[] args) {
        int a =10;
        System.out.println(preIncr(a));
        System.out.println(postIncr(a));

    }
}
