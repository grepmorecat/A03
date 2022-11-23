package a03.tddcolour;

public class Colour {
    float red;
    float green;
    float blue;

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
        red = (float) (((rgb >> 16) & 0xFF) / 256.0);
        green = (float) (((rgb >> 8) & 0xFF) / 256.0);
        blue = (float) ((rgb & 0xFF) / 256.0);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Colour) {
            if (red == ((Colour) other).red && green == ((Colour) other).green && blue == ((Colour) other).blue) return true;
            return false;
        }
        return false;
    }
}
