package com.flipkart.learn.day4;
import java.util.Scanner;
//Write a program to accept 2 different numbers from the user and print the prime numbers between these 2 numbers.
public class PrimeNumberGenerator {
    public static void main(String[] args) {
        System.out.println("Enter two Number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i=num1;i<=num2;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        }
    public static boolean isPrime(int num){
      if(num<2|| (num%2 == 0 && num!= 2) ){
          return false;
      }
          for(int i=2;i<=num/2;i++)
          {
              if(num%i==0)
              {
                  return false;
              }
          }
return true;
      }
    }
