package com.first.learn.WEEK4;

public class Lab2Task5 {
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subtotal and the gratuity rate:");
        double subtotal = sc.nextDouble();
        double gratuity_rate = sc.nextDouble() / 100;
        double gratuity = subtotal * gratuity_rate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity + ", and the total is $" + total);
}
