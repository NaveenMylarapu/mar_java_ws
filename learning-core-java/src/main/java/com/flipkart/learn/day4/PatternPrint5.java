package com.flipkart.learn.day4;

//Write a program to print the following output.
/*        1 9 0 0
          0 1 9 0
          0 0 1 9 */
public class PatternPrint5 {

   public static void main(String[] args) {
       for (int i = 1; i <= 3; i++) {
           for (int j = 1; j <= 3; j++) {
               if (j != i)
                   System.out.print("0 ");
               else
               System.out.print("19 ");
           }
           System.out.println();
       }
   }
   }