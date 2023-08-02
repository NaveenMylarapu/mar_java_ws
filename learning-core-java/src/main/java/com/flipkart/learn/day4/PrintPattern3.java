package com.flipkart.learn.day4;

//Write a program to print the following output.
//                         *
//                         * * *
//                         * * * * *
//                         * * * * * * *
public class PrintPattern3 {
    public static void main(String[] args) {
        for (int i = 0; i <=4; i++) {
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
