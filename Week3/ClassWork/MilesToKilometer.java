package com.first.learn.Week3;

public class MilesToKilometer {
    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;

        System.out.println("The are " + kilometers + " kilometers in "+ miles + " miles.");
    }
}
