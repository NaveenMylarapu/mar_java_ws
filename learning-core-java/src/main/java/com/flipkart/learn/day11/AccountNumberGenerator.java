package com.flipkart.learn.day11;

public class AccountNumberGenerator {
    private static float  startnum= 1001;
    public static float getAccountNumber(){
        return startnum++;
    }
}
