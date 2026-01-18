package com.example;

import java.util.ArrayList;

public class Main {
    // Implement this method to calculate and return the average
    public static double calculateAverage(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        double average = calculateAverage(numbers);
        System.out.println("Average value: " + average);
    }
}