package com.first.learn.WEEK6;

public class Lab6Task12 {
    public static void main(String[] args) {
        int cnt = 0;
        System.out.println("The first 50 prime numbers are:");
        for(int i = 2;;i++){
            if(isprime(i)){
                cnt++;
                System.out.printf("%d ", i);
                if(cnt % 10 == 0)
                    System.out.println();
            }
//            System.out.println("cnt = " + cnt + "i = " + i);

            if(cnt == 50)
                break;
        }
    }
    public static boolean isprime(int x){
        for(int i=2;i<x;i++)
            if(x%i==0)
                return false;
        return true;
    }
}
