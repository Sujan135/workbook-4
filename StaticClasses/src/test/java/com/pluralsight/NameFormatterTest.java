package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void FormatTwoParts() {
        assertEquals("Johnson, Mel", NameFormatter.format("Mel", "Johnson"));
    }

    @Test
    public void FormatFullName() {
        assertEquals("Johnson, Dr. Mel B, PhD", NameFormatter.format("Dr.", "Mel", "B", "Johnson", "PhD"));
    }

    @Test
    public void FormatFullNameString() {
        assertEquals("Johnson, Dr. Mel B, PhD", NameFormatter.format("Dr. Mel B Johnson, PhD"));
    }

}