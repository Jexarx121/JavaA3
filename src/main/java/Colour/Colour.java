package Colour;

public class Colour {
    private float redColourValue;
    private float blueColourValue;
    private float greenColourValue;
    private int min = 0;
    private int max = 1;

    public Colour(float redValue, float blueValue, float greenValue) {
        this.setRedColourValue(redValue);
        this.setBlueColourValue(blueValue);
        this.setGreenColourValue(greenValue);
    }

    public float getRedColourValue() {
        return redColourValue;
    }

    public void setRedColourValue(float redColourValue) {
        if (!(min <= redColourValue && redColourValue <= max)) {
            throw new IllegalArgumentException("Red value should be between 0 and 1.");
        }

        this.redColourValue = redColourValue;
    }

    public float getBlueColourValue() {
        return blueColourValue;
    }

    public void setBlueColourValue(float blueColourValue) {
        if (!(min <= blueColourValue && blueColourValue <= max)) {
            throw new IllegalArgumentException("Blue value should be between 0 and 1.");
        }

        this.blueColourValue = blueColourValue;
    }

    public float getGreenColourValue() {
        return greenColourValue;
    }

    public void setGreenColourValue(float greenColourValue) {
        if (!(min <= greenColourValue && greenColourValue <= max)) {
            throw new IllegalArgumentException("Green value should be between 0 and 1.");
        }

        this.greenColourValue = greenColourValue;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }


}
