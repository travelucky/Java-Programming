package com.first.learn.chapter1;

public class Average_speed_in_kilometers {
    public static void main(String[] args) {
        int time = 1 * 60 * 60 + 40 * 60 + 35;
        double distance = 24 * 1.6;
        double speed = distance / (time *1.0 / 60 / 60);
        System.out.println("The average speed in kilometers is " + speed);
    }
}
