package Colour;

public class Main {
    public static void main(String[] args) {
//        Colour colour = new Colour(001001001);
//        Colour colour2 = new Colour(001001001);
//        if (colour.equals(colour2)) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("False");
//        }

        int length = 16777215;
        int red = (length >> 16) & 255;
        int green = (length >> 8) & 255;
        int blue = length & 255;


        System.out.println("You entered " + blue);
        System.out.println(green);
        System.out.println(red);

//        colour.setGreenColourValue(257);
    }
}