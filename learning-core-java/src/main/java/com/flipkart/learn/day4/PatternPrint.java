package com.flipkart.learn.day4;

//Write a program to print the following output.
//1
//2 3
//         1
//         2 3
//         4 5 6
//         7 8 9 10
//         11 12 13 14 15

//4 5 6 7
//8 9 10 11
public class PatternPrint {
    public static void main(String[] args) {
       /* for(int i=1;i<=4;i++)//i=rows
        {
for(int j=i;j<=2*i-1;j++){
    System.out.print(j+" ");
}
            System.out.println();
        }*/
        int n = 5;
       for (int i = 1; i <= 5; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <i; k++) {
                System.out.print(" ");
            }
            for (int j =i; j <= n+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
