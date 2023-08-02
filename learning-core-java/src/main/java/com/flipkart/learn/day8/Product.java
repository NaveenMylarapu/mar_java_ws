package com.flipkart.learn.day8;

public class Product {
    int pid;
    int price;
    String pName;


    public Product(int pid, int price, String pName){
        this.pid = pid;
        this.price = price;
        this.pName=pName;
    }
    public void discount(int percentage){
         int discount= (int) (this.price * percentage/(float)100);
         this.price-=discount;


    }
    public void showDetails(){
        System.out.println("Product Id is "+pid);
        System.out.println("Product price is "+ price);
        System.out.println("Product Name is "+pName);

    }

}
