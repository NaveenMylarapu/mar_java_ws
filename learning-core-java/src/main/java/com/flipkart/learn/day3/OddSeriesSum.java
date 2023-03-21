package com.flipkart.learn.day3;
import java.util.Scanner;
//Write a program to accept a number “n” from the user; then display the series 1,3,5,7,9,…,n and
// find the sum of the numbers in this series.
public class OddSeriesSum {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0)
           sum+=i;
        }
        System.out.println("The Odd Series Sum is " + sum);
    }
}


