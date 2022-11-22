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
}
