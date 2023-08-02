package com.flipkart.learn.JavaPointArraysPractice;

//Program to find the frequency of each element in the array
// 1   2   8  3   2   2   2   5   1
public class FreqInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 3, 4};
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            if(x==-1)continue;
            for (int j = i; j < arr.length; j++) {
                if (x == arr[j]) {
                    count++;
                    arr[j] = visited;
                }
            }
            System.out.println("Frequency of" + x + "is " + count);
        }
    }
}
