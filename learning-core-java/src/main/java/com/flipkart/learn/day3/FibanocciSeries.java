package com.flipkart.learn.day3;

import java.util.Scanner;
import java.math.BigInteger;

//Write a program to print the Fibonacci series up to the number 34.
//(Example: 0,1,1,2,3,5,8,13,…Series starts with 0 and 1, the succeeding numbers of the series are arrived
//by adding the previous 2 numbers.)
public class FibanocciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        for(int i=0;i<=num;i++)
        {
            System.out.print(a+" ");
            BigInteger sum = a.add(b);
            a=b;
            b=sum;

        }
    }
}
