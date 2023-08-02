package com.flipkart.learn.day4;

import java.util.Scanner;

public class Dayname {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("The day for "+num+ "is "+"Monday");
                break;
            case 2:
                System.out.println("The day for "+num+ " is "+"Tuesday");
                break;
            case 3:
                System.out.println("The day for "+num+ " is "+"Wednesday");
                break;
            case 4:
                System.out.println("The day for "+num+ " is "+"Thursday");
                break;
            case 5:
                System.out.println("The day for "+num+ " is "+"Friday");
                break;
            case 6:
                System.out.println("The day for "+num+ " is "+"Satuarday");
                break;
            case 7:
                System.out.println("The day for "+num+ " is "+"Sunday");
                break;
            default:
                System.out.println("Enter Invalid day"+"please enter days between 1-7 ");

        }
    }
}
