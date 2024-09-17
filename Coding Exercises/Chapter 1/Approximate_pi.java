package com.first.learn.chapter1;

public class Approximate_pi {
    public static void main(String[] args) {
        double first = 0,second = 0;
        int tag = 1;
        for(int i = 1;i <= 13;i+=2){
            if(i <= 11) first += 1.0 * tag / i;
            second += 1.0 * tag / i;
            tag = -tag;
        }
        first *=4;
        second *=4;
        System.out.println("The first approximate pi is " + first);
        System.out.println("The second approximate pi is " + second);
    }
}
