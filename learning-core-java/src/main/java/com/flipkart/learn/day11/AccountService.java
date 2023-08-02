package com.flipkart.learn.day11;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public void showAllAccountDetails(){
      if(accList.isEmpty())
          System.out.println("no Accounts are created yet,please create account to see details");
      else for(Account acc:accList)
          acc.showDetails();
    }
    private List<Account> accList;
    public AccountService() {
        accList = new ArrayList<>();
    }
    private Account getAccount(float accNumber){
        for(Account acc :accList){
             if(acc.getAccNumber()==accNumber){
                 return acc;
             }
        }
        return null;
    }
    public void createAccount(String name , float bal){
        Account acc = new Account(name,bal);
        accList.add(acc);
        System.out.println("Account created sucessfully with Account Number"+acc.getAccNumber());
    }
    public void withDrawAmount(float accNumber , float amount){
        Account acc = getAccount(accNumber);
        if(acc!=null){
            float bal=  acc.withdraw(amount);

        }
       else
            System.out.println("Account do not exist");
    }
    public void depositAmount(float accNumber, float amount){
        Account acc = getAccount(accNumber);
        if(acc !=null){
            float bal=   acc.deposit(amount);
        }
        else
            System.out.println("account do not exist");
    }
    public void showDetails(float accNumber){
        Account acc = getAccount(accNumber);
        if(acc!=null)
        acc.showDetails();
    }
}