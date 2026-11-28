package org.example;

/**
 * Simple demonstration class that prints a greeting and a sequence of numbers.
 *
 * This class is intentionally minimal and serves as a basic example for the
 * Maven project structure. It can be expanded with real application logic as
 * needed.
 */
public class Main {

    /**
     * Entry point of the application.
     *
     * @param args command‑line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Hello Maven");

        // Print numbers 1 through 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}