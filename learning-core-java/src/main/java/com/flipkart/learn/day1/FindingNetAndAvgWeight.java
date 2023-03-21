package com.flipkart.learn.day1;

import java.util.Scanner;

//Write a program to accept the weight of 5 persons (one by one) and display the net weight and the average weight.
public class FindingNetAndAvgWeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of 1st Person :");
        double a = sc.nextDouble();
        System.out.println("Enter weight of 2nd Person :");
        double b = sc.nextDouble();
        System.out.println("Enter weight of 3rd Person :");
        double c = sc.nextDouble();
        System.out.println("Enter weight of 4th Person :");
        double d = sc.nextDouble();
        System.out.println("Enter weight of 5th Person :");
        double e = sc.nextDouble();
        double net_weight = (a + b + c + d + e);
        double avg_weight = net_weight/ 5;



        System.out.println("The NetWeight of 5 persons is : " + net_weight);
        System.out.println("The Average  of 5 persons is : " + avg_weight);
    }
}
