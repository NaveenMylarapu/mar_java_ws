package com.flipkart.day1;
import java.util.Scanner;

// Write a program to accept two numbers from the user and find their sum and average
public class FindingSumAndAvg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int x = sc.nextInt();
        System.out.println("Enter another value :");

        double y = sc.nextDouble();
        double sum = x + y;
        double avg = x / y;
        System.out.println("The sum of two values is :" + sum);
        System.out.println("The average of two values is :" + avg);

    }
}
