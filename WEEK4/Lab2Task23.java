package com.first.learn.WEEK4;

import java.util.Scanner;

public class Lab2Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2:");
        int num2 = sc.nextInt();
        int maxv = (num1 > num2) ? num1 : num2;
        System.out.println("The max value is " + maxv);
    }
}
