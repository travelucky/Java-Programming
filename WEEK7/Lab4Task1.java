package com.first.learn.WEEK7;

public class Lab4Task1 {
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is " + sum(1,10));
        System.out.println("Sum from 20 to 30 is " + sum(20,30));
        System.out.println("Sum from 35 to 45 is " + sum(35,45));
    }
    public static int sum(int a, int b) {
        int res = 0;
        for(int i = a; i <= b; i++){
            res += i;
        }
        return res;
    }
}
