package com.flipkart.learn.JavaPointArraysPractice;
public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 3, 4};
        int[] arr2 = new int[]{11, 2, 33, 4,55, 6, 111, 222, 23, 23, 24};
        int visited=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==visited)
            for (int j = 0; j < arr2.length; j++) {
                if(arr[i]==arr2[j])
                    System.out.print(arr[i]+" ");
                arr[i]=visited;
            }
        }

        }
}
