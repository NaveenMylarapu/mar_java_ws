package com.flipkart.learn.day4;


//Write a program to accept a number “n” from the user;
// find the sum of the series 1/23+1/33+1/43……..+1/n3.

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum =0;
        for(int i=2;i<=n;i++)
        {
           float x= i*i*i;
            sum+=1/x;
        }
        System.out.println(sum);
    }
}

