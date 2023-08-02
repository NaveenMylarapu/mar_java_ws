package com.flipkart.learn.JavaPointArraysPractice;
public class DuplicateElement {


    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{129, 121, 154, 156, 77, 10, 11, 17};
        int small1 = arr[0];
        int  small2= arr[1];
        if(arr[0]<arr[1]) {
            small1 = arr[0];
            small2 = arr[1];
        }
        else
            small1=arr[1];
             small2=arr[0];
        for (int i = 2; i < arr.length; i++) {

          if(arr[i]<small1){
              small2=small1;
              small1=arr[i];

          }
          else if(arr[i]<small2)
              small2=arr[i];
        }
        System.out.println(small2);

    }
}
