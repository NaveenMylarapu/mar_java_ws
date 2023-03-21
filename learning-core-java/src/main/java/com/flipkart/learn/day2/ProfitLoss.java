package com.flipkart.learn.day2;

import java.util.Scanner;

//If cost price and selling price of an item is input through the keyboard,
// write a program to determine whether the seller has made a profit or incurred a loss.
// Also determine the quantum of profit or loss.
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price : ");
        double cp = sc.nextDouble();
        System.out.println("Enter Selling Price : ");
        double sp = sc.nextDouble();
        System.out.println("Enter Additional Expenses : ");
        double additionalExpenses = sc.nextDouble();
        double profit = sp - cp -additionalExpenses;
        double loss = cp - sp + additionalExpenses;
        if(sp > cp && profit > loss) {
            System.out.println("You Have Made a Profit");
            System.out.println("The profit you made is : " + profit);
        }
        else
            System.out.println("A Loss Has been incurred to you");


    }

}
