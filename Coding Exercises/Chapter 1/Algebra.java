package com.first.learn.chapter1;

public class Algebra {
    public static void main(String[] args) {
        System.out.println("The 2 * 2 linear equations is : ");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x * 0.55y = 5.9");
        double a = 3.4,b = 50.2,c = 2.1,d = 0.55,e = 44.5,f = 5.9;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println();
        System.out.println("The x is " + x);
        System.out.println("The y is " + y);
    }
}
