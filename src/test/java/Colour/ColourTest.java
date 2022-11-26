package Colour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    Colour colour1;
    Colour colour2;
    Colour colour3;
    @BeforeEach
    public void setup() {
        colour1 = new Colour(1, 1, 1);
        colour2 = new Colour(16777215);
        colour3 = new Colour(14561);
    }

    @Test
    @DisplayName("Creating a colour through constructor with 3 parameters.")
    public void testThreeParameterColour() {
        assert colour1 != null;
    }

    @Test
    @DisplayName("Creating 3 parameters colours that should throw exceptions.")
    public void testThreeParameterColourException() {
        Throwable exceptionRed = assertThrows(IllegalArgumentException.class, () ->
                new Colour(2, 1, 1));
        Throwable exceptionBlue = assertThrows(IllegalArgumentException.class, () ->
                new Colour(1, 1, 2));
        Throwable exceptionGreen = assertThrows(IllegalArgumentException.class, () ->
                new Colour(1, 2, 1));

        assertAll(
                () ->  assertEquals("Red value should be between 0 and 1 or 255.", exceptionRed.getMessage()),
                () ->  assertEquals("Blue value should be between 0 and 1 or 255.", exceptionBlue.getMessage()),
                () -> assertEquals("Green value should be between 0 and 1 or 255.", exceptionGreen.getMessage())
        );
    }

    @Test
    @DisplayName("Creating a colour with single parameter constructor.")
    public void testSingleParameterColour() {
        assert colour3 != null;
    }

    @Test
    @DisplayName("Creating single parameter colour that should throw an exception.")
    public void testSingleParameterColourException() {
        Throwable exceptionLength = assertThrows(IllegalArgumentException.class, () ->
                new Colour(1000000000));

        assertEquals("RGB value should be between 0 and 16777215.", exceptionLength.getMessage());
    }

    @Test
    @DisplayName("Comparing colours' rgb values.")
    public void testEqualsColours() {
        assertTrue(colour1.equals(colour2));
        assertFalse(colour2.equals(colour3));
    }
}