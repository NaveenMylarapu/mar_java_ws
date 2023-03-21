package com.flipkart.learn.day3;

import java.util.Scanner;

//Write a program to accept a number and determine whether it is a prime number or not.
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int count =0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                count++;
        }
        if (count==2)
            System.out.println("The Number you entered is  Prime");
        else
            System.out.println("The Number you entered is  Not Prime");
    }
}