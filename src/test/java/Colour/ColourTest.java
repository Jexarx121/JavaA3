package Colour;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    public void testThreeParameterColour() {
        Colour colour = new Colour(1, 1, 1);
        assertTrue(colour.getMin() <= colour.getRedColourValue() && colour.getRedColourValue() <= colour.getMax());
        assertTrue(colour.getMin() <= colour.getBlueColourValue() && colour.getBlueColourValue() <= colour.getMax());
        assertTrue(colour.getMin() <= colour.getGreenColourValue() && colour.getGreenColourValue() <= colour.getMax());
    }

    @Test
    public void testThreeParameterColourException() {
        Throwable exceptionRed = assertThrows(IllegalArgumentException.class, () ->
                new Colour(2, 1, 1));
        Throwable exceptionBlue = assertThrows(IllegalArgumentException.class, () ->
                new Colour(1, 1, 2));
        Throwable exceptionGreen = assertThrows(IllegalArgumentException.class, () ->
                new Colour(1, 2, 1));

        assertEquals("Red value should be between 0 and 1 or 255.", exceptionRed.getMessage());
        assertEquals("Blue value should be between 0 and 1 or 255.", exceptionBlue.getMessage());
        assertEquals("Green value should be between 0 and 1 or 255.", exceptionGreen.getMessage());
    }

    @Test
    public void testSingleParameterColour() {
        Colour colour = new Colour(14561);
        assertTrue(colour.getMin() <= colour.getRedColourValue() && colour.getRedColourValue() <= colour.getMax());
        assertTrue(colour.getMin() <= colour.getBlueColourValue() && colour.getBlueColourValue() <= colour.getMax());
        assertTrue(colour.getMin() <= colour.getGreenColourValue() && colour.getGreenColourValue() <= colour.getMax());
    }

    @Test
    public void testSingleParameterColourException() {
        Throwable exceptionLength = assertThrows(IllegalArgumentException.class, () ->
                new Colour(1000000000));

        assertEquals("RGB value should be between 0 and 16777215.", exceptionLength.getMessage());
    }

    @Test
    public void testEqualsColours() {
        Colour colour = new Colour(16777215);
        Colour colour2 = new Colour(12452);
        Colour colour3 = new Colour(1, 1, 1);

        assertTrue(colour.equals(colour3));
        assertFalse(colour2.equals(colour));
    }
}