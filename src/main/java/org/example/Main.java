package org.example;

/**
 * Entry point for the example package.
 * <p>
 * Demonstrates a simple loop that prints numbers 1 through 5.
 * </p>
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Maven");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
