package com.flipkart.learn.day1;

//Write a program to find the simple interest based on the following data: P = Rs 6000, R = 10%, T = 1.5 years.
public class FindingSimpleInterest {
    public static void main(String[] args) {
        int p = 6000;
        double r = 0.1;
        double t = 1.5;
        double simpleinterest = (p * t * r) / 100;
        System.out.println("The simple Interest for given values is : " + simpleinterest);

    }

}
