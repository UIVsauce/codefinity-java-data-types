package com.example;

public class Main {
    public static String getInitials(String fullName) {
        String[] parts = fullName.split(" ");
        char firstInitial = Character.toUpperCase(parts[0].charAt(0));
        char lastInitial  = Character.toUpperCase(parts[1].charAt(0));
        return "" + firstInitial + lastInitial;
    }

    public static void main(String[] args) {
        String fullName = "John Doe";
        String initials = getInitials(fullName);
        System.out.println("Initials: " + initials);
    }
}