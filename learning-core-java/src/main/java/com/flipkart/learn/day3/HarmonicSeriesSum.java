package com.flipkart.learn.day3;
import java.util.*;
//Write a program to accept a number “n” from the user;
// then display the sum of the series 1+1/2+1/3+……….+1/n.
public class HarmonicSeriesSum {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= num; i++) {
            sum = sum + (1.0 / i);
            System.out.println(sum+" ");
        }
        System.out.printf("The Harmonic Series sum of "+num+" is "+"%.2f",sum);
    }
}
