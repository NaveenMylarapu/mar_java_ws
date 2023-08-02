package com.flipkart.learn.day8;

import java.util.List;

public class ProductManager {
    public static void main(String[] args) {
        // Create 10 products and store in a container
        //if price > 5000 apply discount 10% and show details
        //show max priced products
        //show products in a sorting order based on price
        Product p1 = new Product(1, 100, "Milk");
        Product p2 = new Product(2, 120, "Water");
        Product p3 = new Product(3, 143, "Veggies");
        Product p4 = new Product(4, 1000, "Meat");
        Product p5 = new Product(5, 650, "Clothes");
        Product p6 = new Product(6, 1240, "Skin Care");
        Product p7 = new Product(7, 500, "Fruits");
        Product p8 = new Product(8, 6411, "Laptops");
        Product p9 = new Product(9, 14367, "Electronics");
        Product p10 = new Product(1, 166000, "Bike");
        List<Product> list = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        list.add(p1);
        list.add(p2);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
        for (Product p : list) {
            if (p.price > 5000) {
                System.out.println("The product " + p.pName + "Price is " + p.price);
                p.discount(10);
                System.out.println("10% Applied discount and Price of product After discount is   " + p.price);
                p.showDetails();
                System.out.println("-".repeat(100));
            }
        }
        int max = list.get(0).price;
        for (Product p : list) {

            if (max < p.price)
                max = p.price;
        }
        System.out.println("The Max Priced Product is " + max);


        System.out.println();


        //public static void sortByPrice(List<Product> list){
        // for(int i=1;i< list.size();i++){
        //    if(p.price
       /* int min=list.get(0).price;
        private static void sortByPrice(List<Product> list) {
            List<Product> sortedlist = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).price<list.)


            }
        }

        */

    }
    }
