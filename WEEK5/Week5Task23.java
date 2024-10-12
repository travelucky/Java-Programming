package com.first.learn.WEEK5;

import java.util.Scanner;

public class Week5Task23 {
    public static void main(String[] args) {
        System.out.println("Enter the length from the center of a pentagon to a vertex: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = 2 * r * Math.sin(Math.PI/5);
        double area = 5 * s * s / (4 * Math.tan(Math.PI/5));

        System.out.println("The area is " + area);
    }
}
