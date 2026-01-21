/*
 * License or copyright information, if present.
 * Copyright 2026 Tran Gia Huy Project.
 */
package me.trangiahuy.demo;

// Imports

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Thi class represents the rules of coding conventions.
 *
 * <p> Exactly one top-level class per file.
 * Paragraphs in Javadoc are separated by a blank line.
 *
 * @author Tran Gia Huy
 */
public class StyleGuideDemo { // Class names in UpperCamelCase

    // Block indentation: +4 spaces

    // Constant names use UPPER_SNAKE_CASE
    public static final int MAX_REQUEST_LIMIT = 100;

    // Non-constant field names in lowerCamelCase
    private final String instanceName;
    private final int processCount = 0;

    /**
     * Summary fragment: A brief summary. Not a complete sentence.
     */
    public StyleGuideDemo(String instanceName) {
        this.instanceName = instanceName;
    }

    // Overloads: never split. Put them together.
    public void processData() {
        processData(emptyList());
    }

    /**
     * Processing input data.
     *
     * @param items List of items have to process Block tags order: param, return...
     * @return the number of items have been processed
     */
    public int processData(List<String> items) {
        // One variable per declaration
        int successCount = 0;

        // Braces always used, even for single statements
        if (items.isEmpty()) {
            return 0;
        }

        // Horizontal whitespace rules
        for (String item : items) {
            if (item != null) {
                successCount++;
            }
            // K & R style braces: Line break after opening brace
        }

        return successCount;
    }

    // @Override: always used
    @Override
    public String toString() {
        // Text Blocks (Java 15+) are supported and follow indentation rules
        return """
                GoogleStyleDemo {
                  name: %s
                }
                """.formatted(instanceName);
    }

    /**
     * Switch expression (Java 17 style) and indent.
     */
    public String getStatusDescription(int statusCode) {
        // Switch statements and expressions formatting
        return switch (statusCode) {
            case 200 -> "OK";
            case 404 -> "Not Found";
            // Every switch must be exhaustive (usually needs default)
            default -> {
                // Indent +4 for block inside switch
                String unknown = "Unknown code: " + statusCode;
                yield unknown;
            }
        };
    }

    // Method names in lowerCamelCase
    public void demonstrateLongLines() {
        // Column limit: 100 characters
        // Line-wrapping: break at higher syntactic level
        // Indent continuation lines at least +4 spaces
        List<String> filteredList = new ArrayList<>();
        filteredList.stream()
                .filter(item -> item.length() > 10 && item.startsWith("prefix")) // Indent +8
                .collect(toList());
    }

    // Caught exceptions: not ignored
    public void dangerousOperation() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Comment explaining why no action is taken
            // logging is sufficient here
            System.err.println(e.getMessage());
        }
    }

    // Array initializers
    private void arrayFormat() {
        int[] numbers = new int[]{0, 1, 2, 3};
    }

    // Helper method for example
    private List<String> emptyList() {
        return new ArrayList<>();
    }
}