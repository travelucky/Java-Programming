package com.first.learn.WEEK5;

public class Week5Task6 {
    public static void main(String[] args) {
        char ch = 'B';
        System.out.println(ch);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        }
        else if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric number");
        }
    }
}
