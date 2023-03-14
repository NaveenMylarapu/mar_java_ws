package com.flipkart.day2;

import java.util.Scanner;

//Write a program to accept a number from the user. If the number is negative then convert
// it to a positive number and print; if it is a positive number, print it as is
public class ConvertPositiveToNegative {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0)
            System.out.println("The number you entered is : " + x);
        else
            System.out.println("The positive value for the number you entered is : "+(-x));
    }

}
