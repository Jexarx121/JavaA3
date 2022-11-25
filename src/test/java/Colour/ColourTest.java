package Colour;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    public void testColour() {
        Colour colour = new Colour(1, 1, 1);
        assertTrue(colour.getMin() <= colour.getRedColourValue() && colour.getRedColourValue() <= colour.getMax());
        assertTrue(colour.getMin() <= colour.getBlueColourValue() && colour.getBlueColourValue() <= colour.getMax());
        assertTrue(colour.getMin() <= colour.getGreenColourValue() && colour.getGreenColourValue() <= colour.getMax());
    }

    @Test
    public void testColourException() {
        Throwable exceptionRed = assertThrows(IllegalArgumentException.class, () ->
                new Colour(2, 1, 1));
        Throwable exceptionBlue = assertThrows(IllegalArgumentException.class, () ->
                new Colour(1, 2, 1));
        Throwable exceptionGreen = assertThrows(IllegalArgumentException.class, () ->
                new Colour(1, 1, 2));

        assertEquals("Red value should be between 0 and 1.", exceptionRed.getMessage());
        assertEquals("Blue value should be between 0 and 1.", exceptionBlue.getMessage());
        assertEquals("Green value should be between 0 and 1.", exceptionGreen.getMessage());
    }


}