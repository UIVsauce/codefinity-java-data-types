package com.example;

public class Main {
    public static void main(String[] args) {
        int a = 1000000000;
        int b = 1000000000;
        long sum = (long) a + (long) b;
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            System.out.println("Warning: Integer overflow");
        } else {
            System.out.println((int) sum);
        }
    }
}