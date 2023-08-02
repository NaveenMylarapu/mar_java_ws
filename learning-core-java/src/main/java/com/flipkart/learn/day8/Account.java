package com.flipkart.learn.day8;

public class Account {
    int accNum;
    String name;
    double balance;
  public Account(int accNum,String name,double balance){
      this.accNum= accNum;
      this.name = name;
      this.balance = balance;
      int allBal = 0;
  }

    public void showDetails(){
        System.out.println("Account number is :"+ accNum);
        System.out.println("Name is "+name);
        System.out.println("Balance is"+balance);

    }

}
