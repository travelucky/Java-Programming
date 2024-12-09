package com.first.learn.chapter1;

public class Area_and_perimeter_of_a_circle {
    public static void main(String[] args) {
        double radius = 5.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}
