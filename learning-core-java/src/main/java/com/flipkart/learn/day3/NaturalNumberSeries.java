package com.flipkart.learn.day3;
import java.util.Scanner;

//Write a program to accept a number from the user; display the natural number series for the entered number
//(1,2,3,4,…,N) and calculate the sum of this series.
public class NaturalNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int sum =0;
        for(int i=0;i<=num;i++) {
            sum += i;
        }
            System.out.println("The Natural Number Series of "+num+" is "+sum);
    }
}

