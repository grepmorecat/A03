package a03.tddcolour;

public class Colour {
    private float red;
    private float green;
    private float blue;

    public Colour(float r, float g, float b) {
        if (r > 1F || r < 0F|| g > 1F || g < 0F || b > 1F || b < 0F) {
            throw new IllegalArgumentException("Parameter out of range.");
        }
        red = r;
        green = g;
        blue = b;
    }
    public Colour(int rgb) {
        if (rgb > 0xFFFFFF || rgb < 0) {
            throw new IllegalArgumentException("Parameter out of range.");
        }
        int bitmask = 0xFF;
        red = (float) ((double)((rgb & (bitmask * 16)) / 16) / (double)0xFF);
        green = (float) ((double)((rgb & (bitmask * 4)) / 4) / (double)0xFF);
        blue = (float) ((double)(rgb & bitmask) / (double)0xFF);
    }
}
