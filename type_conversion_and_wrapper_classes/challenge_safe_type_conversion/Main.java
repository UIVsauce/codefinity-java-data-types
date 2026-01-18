package com.example;

public class Main {
    public static void safeDoubleToInt(double value) {
        int intValue = (int) value;
        System.out.println("Original double value: " + value);
        System.out.println("Converted int value: " + intValue);
        if (value != intValue) {
            System.out.println("Warning: Data loss occurred during conversion.");
        }
    }

    public static void main(String[] args) {
        safeDoubleToInt(42.7);
    }
}