package com.flipkart.learn.day11;

import java.util.Scanner;

public class AccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountService service = new AccountService();
        while (true) {
            System.out.println("1. Create 2. withdraw 3. Deposit 4. ShowDetails 5. showAllAccountDetails 6. Exit ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.println(" Enter name");
                    String name = sc.nextLine();
                    System.out.println("Enter Initial balance");
                    float bal = sc.nextFloat();
                    service.createAccount(name, bal);
                    break;
                case 2:
                    System.out.println("enter account number");
                    float withdrawAccNumber = sc.nextFloat();
                    System.out.println("enter withdraw amount");
                    float withdrawAmount = sc.nextFloat();
                    service.withDrawAmount(withdrawAccNumber, withdrawAmount);
                    break;
                case 3:
                    System.out.println("enter account number");
                    float depositAccNumber = sc.nextFloat();
                    System.out.println("enter deposit amount");
                    float depositAmount = sc.nextFloat();
                    service.depositAmount(depositAccNumber, depositAmount);
                    break;
                case 4:
                    System.out.println("enter account number");
                    float accNumber = sc.nextFloat();
                    service.showDetails(accNumber);
                    break;
                case 5:
                    service.showAllAccountDetails();
                    break;
                default:
                    System.out.println("EXIT");
            }
            System.out.println("Do you want to continue, enter 1 to continue");
            int choice = sc.nextInt();
            if (choice != 1) {
                break;
            }
        }
    }
}