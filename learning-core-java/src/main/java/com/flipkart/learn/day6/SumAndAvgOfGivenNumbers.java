package com.flipkart.learn.day6;

import java.util.Arrays;

public class SumAndAvgOfGivenNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 3; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        float sum = 0;
        float avg;
        for (int i : arr) {
            sum += i;
        }
        avg = sum / arr.length;
        System.out.println(sum);
        System.out.println(avg);
        int[] ar2 = new int[10];
        //ar2 = generatePrimeNumbers(10);
        System.out.print(Arrays.toString(ar2));

    }
}