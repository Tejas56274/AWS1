package org.example;

/**
 * Simple example program that prints a greeting and counts from 1 to 5.
 */
public class Main {

    /**
     * Entry point of the application.
     *
     * @param args command‑line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Hello Maven");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
