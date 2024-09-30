package com.first.learn.WEEK4;

import java.util.Scanner;

public class Lab2Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = area * length;
        System.out.print("The area of the cylinder is ");
        System.out.printf("%.4f\n",area);
        System.out.print("The volume of the cylinder is ");
        System.out.printf("%.4f\n",volume);
    }
}

