package com.flipkart.learn.day1;
import java.util.Scanner;


// Write a program to accept a number from the user and find the cube of that number (to the power 3).
public class FindingCubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value :");
        int x = sc.nextInt();
        int cube = x*x*x;
        System.out.println("The cube of given Value is : "+cube);


    }
}
