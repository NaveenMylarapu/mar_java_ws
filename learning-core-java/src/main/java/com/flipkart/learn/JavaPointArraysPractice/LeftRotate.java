package com.flipkart.learn.JavaPointArraysPractice;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int count1 = 0, count2 = 0;
        int[][] m1 = {{1, 2,3}, {3, 4,5}};
        int[][] m2 = {{0, 1, 2,}, {3, 4, 5}};
        int[][] m3 = new int[3][3];
        int rsum = 0, colsum = 0, rsum2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                colsum += m1[j][i];
                System.out.print(colsum+" ");
            }
            colsum = 0;
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                //System.out.println(colsum);
            }
            //System.out.println();
        }
    }
}