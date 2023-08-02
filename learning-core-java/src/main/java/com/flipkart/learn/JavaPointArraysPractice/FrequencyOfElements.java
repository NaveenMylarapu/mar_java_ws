package com.flipkart.learn.JavaPointArraysPractice;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 10, 2, 12, 1, 3, 4, 3, 4, 6, 1,};
        int visited = -1;
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != visited) {
                freq[i] = 1;
            } else
                freq[i] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "|" + freq[i]);
        }
    }
}
