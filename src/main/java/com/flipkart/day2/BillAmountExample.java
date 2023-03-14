package com.flipkart.day2;

import java.util.Scanner;

//Write a program to accept the bill amount and age of the customer;
// if the customer’s age is >50 years then give a discount of 5% on the bill.
public class BillAmountExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill Amount : ");
        double bAmnt = sc.nextDouble();
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        if(age > 50) {
            double discount = bAmnt * 0.05;
            double current = bAmnt - discount;
            System.out.println("Discount Applied is : 5% " + "and discount amonut is : "+ discount);
            System.out.println("The Current price is : "+current);
        }
        else
            System.out.println("No discount Applied and your price is : " +bAmnt);


    }
}
