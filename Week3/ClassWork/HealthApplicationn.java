package com.first.learn.Week3;

import java.util.Scanner;

public class HealthApplicationn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in pounds");
        double weight = sc.nextDouble();
        System.out.println("Enter the height in inches");
        double height = sc.nextDouble();

        final double POUND_TO_KILOGRAM = 0.45359237;
        final double INCH_TO_METER = 0.0254;
        weight *= POUND_TO_KILOGRAM;
        height *= INCH_TO_METER;
        double bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);
    }
}
