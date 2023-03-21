package com.flipkart.learn.day3;

import java.util.Scanner;

//Write a program to accept a number,calculate the sum of all even numbers from 0 till the given number;
// similarly repeat the same for the odd numbers; then display these two sums. (
// Example: input number 6; sum of even numbers = 0+2+4+6 =12, sum of odd numbers = 1+3+5 = 9)
public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int sum1 = 0;
        int sum2 =0;
        for(int i = 1;i <= num;i++) {
            if (i % 2 == 0)
                sum1 += i;
            else
                sum2 += i;
        }
            System.out.print("The of even numbers  " +sum1 + "The sum of odd Numbers is "+sum2);
    }
}
