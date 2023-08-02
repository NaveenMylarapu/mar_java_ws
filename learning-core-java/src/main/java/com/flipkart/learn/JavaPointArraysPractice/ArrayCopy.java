package com.flipkart.learn.JavaPointArraysPractice;

//Program to copy all elements of one array into another array
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        //displaying arr1 elements
        for (int i :arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        //displaying arr1 elements
        for (int i :arr2) {
            System.out.print(i+" ");

        }
    }
}
