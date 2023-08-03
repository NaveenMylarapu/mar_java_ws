package com.flipkart.learn.day4;
//import java.util.Scanner;
public class  CountCharacters {

    public static void main(String[] args) {
        System.out.println("Enter a String");
       // Scanner sc = new Scanner(System.in);
        String str = "java learning";
        int v=0,c=0;
        for (int i = 0; i < str.length(); i++) {
            char ap = str.charAt(i);
            switch (ap) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    v++;
                    break;
                default:
                    c++;
            }
        }
        System.out.println("The vowels count in "+str+" is "+v+"\n"+ "and consonants count in "+str+" is "+c);
    }
}