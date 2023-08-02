package com.flipkart.learn.day4;

//Write a program to print the following output.
//                             1
//                             121
//                             12321
//                             1234321
//                             123454321
/*      1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1*/
public class PrintPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
                for (int k = i - 1; k >= 1; k--) {
                    System.out.print(k + " ");
                }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <=4; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
