package com.first.learn.chapter1;

public class Average_speed_in_miles {
    public static void main(String[] args) {
        double time = 45 * 60 + 30;
        double miles = 14.0 / 1.6;
        double speed = miles / (time / 60 / 60);
        System.out.println("The average speed in miles is " + speed);
    }
}
