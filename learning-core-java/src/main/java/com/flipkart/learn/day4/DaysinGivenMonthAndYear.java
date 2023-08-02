package com.flipkart.learn.day4;

import java.util.Scanner;

public class DaysinGivenMonthAndYear {
    public static void main(String[] args) {
        System.out.println("enter a month");
        System.out.println("enter year");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int numdays=0;
switch(x)
{
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        numdays =31;
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        numdays=30;
        break;
    case 2:
        if((y%4==0)&&((y%100!=0)||y%400==0))
       numdays=29;
               else
                   numdays=28;
               break;
    default:
        System.out.println("Invalid month");

}
        System.out.println("Number of days is "+numdays);
    }
}




