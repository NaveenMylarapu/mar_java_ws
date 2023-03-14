package com.flipkart.day2;

import java.util.Scanner;

//Write a program to accept a number and find whether it is even or odd
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println("Number you entered is even");
        else
            System.out.println("Number you entered is odd");
    }
}
