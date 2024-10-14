package com.first.learn.WEEK6;

import java.util.Scanner;

public class Lab6Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < str.length() / 2; i++) {
            int l = i,r = str.length()-1 - l;
            if(str.charAt(l) == str.charAt(r)) continue;
            flag = true;
            break;
        }
        if(flag == false) {
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
