package com.flipkart.learn.day2;

import java.util.Scanner;

//Write a program to accept three numbers and find the biggest number.
public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println("Biggest of three numbers is : " + num1);
        else if (num2 > num3)
            System.out.println("Biggest is : " + num2);
        else
            System.out.println("Biggest is : " + num3);
    }

}

