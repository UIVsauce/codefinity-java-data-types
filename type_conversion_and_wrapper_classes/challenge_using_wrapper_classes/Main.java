package com.example;

public class Main {
    public static int sumStringNumbers(String[] numbers) {
        int sum = 0;
        for (String numStr : numbers) {
            Integer num = Integer.valueOf(numStr);
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] numbers = {"10", "20", "30", "40"};
        int sum = sumStringNumbers(numbers);
        System.out.println("The sum is: " + sum);
    }
}