package com.flipkart.learn.day3;

import java.util.Scanner;

//Write a program to accept a number from the user and print its multiplication table (upto “times 10”).
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print its multiplication Table ");
        int num = sc.nextInt();
        System.out.println("The multiplication Table of " + num + " is" );

        for(int i = 1;i <= 10;i++) {
    System.out.println(num +"*"+ i +"="+ (num * i));
}
    }
}
