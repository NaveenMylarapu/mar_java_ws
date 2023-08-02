package com.flipkart.learn.day4;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revNum = reverse(num);
        System.out.println("The Reverse of " + num + " is " + revNum);
        int sumDig = sumOfDigits(num);
        System.out.println("The Sum of Digits of " + num + " is " + sumDig);
        int sumDigUntilSingleSum = sumOfDigitsUntilSingleSumSingleDigit(sumDig);
        System.out.println("The single digit sum of " + num + "is " + sumDigUntilSingleSum);
        boolean palin = isPalindrome(num);
        System.out.println("The Number " + num + " is " + "palin " + palin);
        boolean armstrong = isArmstrong(num);
        System.out.println("The Number " + num + " is Armstrong " + armstrong);
    }

    private static int reverse(int num) {
        int sum = 0;
        while (num >= 1) {
            int r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        return sum;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num >= 1) {
            int r = num % 10;
            sum += r;
            num = num / 10;
        }
        return sum;
    }

    private static int sumOfDigitsUntilSingleSumSingleDigit(int num) {
        int sum = 0;
        while (num >= 1) {
            int r = num % 10;
            sum += r;
            num = num / 10;
        }
        return sum;
    }

    private static boolean isPalindrome(int num) {
        return reverse(num) == num;
    }

    private static boolean isArmstrong(int num) {
        int sum = 0;
        while (num >= 1) {
            int r = num % 10;
            sum = (int) (sum + Math.pow(r,3));
            num = num / 10;
        }
        return sum == num;
    }
}


