package com.flipkart.learn.day11;

public class Account {
    public float getAccNumber() {
        return accNumber;
    }
    private float accNumber;
    private String name;
    private float bal;
    private static String bankName = "SBI";
    public Account(String name,float bal){
        this.accNumber=AccountNumberGenerator.getAccountNumber();
        this.name=name;
        this.bal=bal;
    }
public float withdraw(float amount){
    if(bal>=amount)
        this.bal=bal-amount;
    else
    System.out.println("you do not have sufficient balance in your Account");
    return bal;
}
public float deposit(float amount){
    this.bal = this.bal+amount;
    return bal;
}
public void showDetails(){
    System.out.println(String.format("%s ,%s ,%s",accNumber,name,bal));
}

}


