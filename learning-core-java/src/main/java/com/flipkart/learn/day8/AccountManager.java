package com.flipkart.learn.day8;

import java.util.List;

public class AccountManager {
    public static void main(String[] args) {
        Account acc1 = new Account(1000,"Naveen",5000);
        Account acc2 = new Account(1001,"Raju",1000);
        Account acc3 = new Account(1003,"Rajesh",4000);
        Account acc4 = new Account(1004,"Rakesh",3000);
        Account acc5 = new Account(1005,"Ravi",30000);
        Account acc6 = new Account(1006,"Ramu",3100);
        Account acc7 = new Account(1007,"Rani",4000);
        Account acc8 = new Account(1008,"Ramesh",43000);
        Account acc9 = new Account(1009,"Rahul",42000);
        Account acc10 = new Account(1010,"Ranjith",38000);
        acc1.showDetails();
        System.out.println("-".repeat(100));
        acc2.showDetails();
        System.out.println("-".repeat(100));
        acc3.showDetails();
        System.out.println("-".repeat(100));
        acc4.showDetails();
        List<Account> list = List.of(acc1,acc2,acc3,acc4,acc5,acc6,acc7,acc8,acc9,acc10);
        int totalbal = 0;
        for(Account acc:list){
            totalbal += acc.balance;
        }
        System.out.println("All Account holders total balance is "+totalbal);
        // Display max balance customer(s) details
        List<Account> list2 = List.of(acc1,acc2,acc3,acc4,acc5,acc6,acc7,acc8,acc9,acc10);
        double  max = 0;
        for(Account acc:list2)
        {
            if(max<acc.balance)
                max=acc.balance;
        }
        System.out.println(max);
        for(Account acc :list2){
            if(acc.balance==max)
               acc.showDetails();
            System.out.println("-".repeat(100 ));
        }

    }
}
