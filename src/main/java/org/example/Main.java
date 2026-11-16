package org.example;

/**
 * Example main class demonstrating a simple loop.
 */
public class Main {

    /**
     * Entry point of the application.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Hello Maven");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
