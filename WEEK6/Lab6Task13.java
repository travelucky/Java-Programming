package com.first.learn.WEEK6;

import java.util.Scanner;

public class Lab6Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer:");
        int a = sc.nextInt();
        System.out.print("Enter the second integer:");
        int b = sc.nextInt();
        int c = gcd(a,b);
        System.out.println("The greatest common divisor for " + a + " and " + b + " is " + c);
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
