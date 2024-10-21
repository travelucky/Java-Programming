package com.first.learn.WEEK7;

public class Lab4Task2 {
    public static void main(String[] args) {
        int i = 5,j = 2;
        int k = max(i,j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    public static int max(int a, int b) {
        int res ;
        if(a>b)
            res=a;
        else
            res=b;
        return res;
    }
}
