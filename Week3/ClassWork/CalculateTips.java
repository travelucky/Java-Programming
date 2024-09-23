package com.first.learn.Week3;

import java.util.Scanner;

public class CalculateTips {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subtotal and the gratuity rate:");
        double subtotal = sc.nextDouble();
        double gratuity_rate = sc.nextDouble() / 100;
        double gratuity = subtotal * gratuity_rate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity + ", and the total is $" + total);
    }

}
