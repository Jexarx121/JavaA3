package Colour;

public class Colour {
    private float redColourValue;
    private float blueColourValue;
    private float greenColourValue;
    private final int MIN = 0;
    private final int MAX = 1;
    private final int MAX_RGB = 255;

    public Colour(float redValue, float greenValue, float blueValue) {
        this.setRedColourValue(redValue);
        this.setGreenColourValue(greenValue);
        this.setBlueColourValue(blueValue);
    }

    public Colour(int rgbValue) {
        this.splitRGBValue(rgbValue);
    }

    public float getRedColourValue() {
        return redColourValue;
    }

    public void setRedColourValue(float redColourValue) {
        if (!(MIN <= redColourValue && redColourValue <= MAX)) {
            throw new IllegalArgumentException("Red value should be between 0 and 1 or 255.");
        }

        this.redColourValue = redColourValue;
    }

    public float getBlueColourValue() {
        return blueColourValue;
    }

    public void setBlueColourValue(float blueColourValue) {
        if (!(MIN <= blueColourValue && blueColourValue <= MAX)) {
            throw new IllegalArgumentException("Blue value should be between 0 and 1 or 255.");
        }

        this.blueColourValue = blueColourValue;
    }

    public float getGreenColourValue() {
        return greenColourValue;
    }

    public void setGreenColourValue(float greenColourValue) {
        if (!(MIN <= greenColourValue && greenColourValue <= MAX)) {
            throw new IllegalArgumentException("Green value should be between 0 and 1 or 255.");
        }

        this.greenColourValue = greenColourValue;
    }

    private void splitRGBValue(int rgbValue) {
        if (String.valueOf(rgbValue).length() != 9) {
            throw new IllegalArgumentException("Length of rgb value should be 9 with 3 integers for each.");
        }

        float redColour = (rgbValue >> 16) & 0xFF;
        float greenColour = (rgbValue >> 8) & 0xFF;
        float blueColour = (rgbValue) & 0xFF;

        this.setRedColourValue(redColour/MAX_RGB);
        this.setGreenColourValue(greenColour/MAX_RGB);
        this.setBlueColourValue(blueColour/MAX_RGB);
    }

    public int getMin() {
        return MIN;
    }

    public int getMax() {
        return MAX;
    }


}
