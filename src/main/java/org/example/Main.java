package org.example;

/**
 * Example entry point class demonstrating a simple loop.
 *
 * The {@code main} method prints a greeting and then iterates from 1 to 5,
 * outputting each value. This class serves as a basic example for the project.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Maven");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
