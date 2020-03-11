package com.javaLearning;

public class LargestPrime {
    public static void main(String[] args){
        getLargestPrime(21);
        getLargestPrime(217);
        getLargestPrime(0);
        getLargestPrime(45);
        getLargestPrime(-1);
    }
    public static int getLargestPrime(int number){
        int largestPrime = 2;
        if(number < largestPrime)
            return -1;
        for(int i = largestPrime; i <= number; i++) {
            if(number % i == 0) {
                number/=i;
                largestPrime = i;
                i--;
            }
        }
        return largestPrime;
    }
}