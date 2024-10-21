package com.first.learn.WEEK7;

import java.util.Scanner;

public class Lab4Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer : ");
        int a = sc.nextInt();
        System.out.println("Enter second integer : ");
        int b = sc.nextInt();
        System.out.println("The greatest common divisor for " + a + " and " + b + " is " + gcd(a,b));

    }
    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        else return gcd(b, a % b);
    }
}
