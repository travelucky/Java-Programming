package com.first.learn.chapter1;

import java.net.SocketOption;

public class Summation_of_a_series {
    public static void main(String[] args) {
        System.out.print("The expression is :");
        int sum = 0;
        for (int x = 1; x <= 9; x++) {
            if(x != 9) System.out.print(x + " + ");
            else System.out.println(x);
            sum +=x;
        }
        System.out.println("The sum is " + sum);
    }
}
