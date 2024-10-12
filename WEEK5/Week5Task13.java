package com.first.learn.WEEK5;

import java.util.Scanner;

public class Week5Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        String s = sc.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is: " + ch);
    }
}
