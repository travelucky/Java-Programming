package com.first.learn.Week3;

import java.util.Scanner;

public class ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = area * length;
        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
