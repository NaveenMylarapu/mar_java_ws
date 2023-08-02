package com.flipkart.learn.day4;

/*Write a program to print the following output.
        *
        * *
        * * *
        * * * *
        * * * * */
public class PrintPattern2 {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
