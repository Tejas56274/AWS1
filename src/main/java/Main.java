package org.example;

/**
 * Entry point that forwards execution to {@link org.example.Main}.
 * This prevents duplicate code between the default‑package Main class and the
 * packaged implementation, improving maintainability.
 */
public class Main {
    public static void main(String[] args) {
        // Forward the call to the actual implementation
        org.example.Main.main(args);
    }
}
