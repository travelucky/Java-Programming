package com.first.learn.Week3;

import java.util.Scanner;

public class Example_2_4 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = PI * radius * radius;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
