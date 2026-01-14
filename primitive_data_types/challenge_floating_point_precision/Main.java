package com.example;

public class Main {
    public static double[] calculateSums() {
        float floatSum = 0.1f + 0.2f;
        double doubleSum = 0.1 + 0.2;
        return new double[] { floatSum, doubleSum };
    }

    public static void main(String[] args) {
        double[] results = calculateSums();
        System.out.println("float result: " + results[0]);
        System.out.println("double result: " + results[1]);
    }
}