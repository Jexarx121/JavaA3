package Colour;

public class Colour {
    private float redColourValue;
    private float blueColourValue;
    private float greenColourValue;
    private final int MIN = 0;
    private final int MAX = 1;

    private final int MAX_RGB = 255;
    private final int MAX_INT = 16777215;

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
        if (MIN < rgbValue && rgbValue > MAX_INT) {
            throw new IllegalArgumentException("RGB value should be between 0 and 16777215.");
        }

        float redColour = (rgbValue >> 16) & 255;
        float greenColour = (rgbValue >> 8) & 255;
        float blueColour = (rgbValue) & 255;

        this.setRedColourValue(redColour/ MAX_RGB);
        this.setGreenColourValue(greenColour/ MAX_RGB);
        this.setBlueColourValue(blueColour/ MAX_RGB);
    }

    @Override
    public boolean equals(Object rgbValue) {
        if (rgbValue == this) {
            return true;
        }

        if (!(rgbValue instanceof Colour)) {
            return false;
        }

        Colour rgb = (Colour) rgbValue;

        return Float.compare(this.getRedColourValue(), rgb.getRedColourValue()) == 0
                && Float.compare(this.getGreenColourValue(), rgb.getGreenColourValue()) == 0
                && Float.compare(this.getBlueColourValue(), rgb.getBlueColourValue()) == 0;
    }

    public int getMin() {
        return MIN;
    }

    public int getMax() {
        return MAX;
    }


}
