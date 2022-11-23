package a03.tddcolour;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ColourTest {
    @Test
    @DisplayName("A constructor should take any combination of three parameters of float values between 0.0 to 1.0.")
    void constructorThreeParameter() {
        Colour c0 = new Colour(0F, 0F, 0F);
        Colour c1 = new Colour(1F, 1F, 1F);
    }

    @Test
    @DisplayName("A constructor should throw IllegalArgumentException if any of the parameter value is not between 0.0 and 1.0")
    void constructorThreeParameterThrowOutOfRange() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Colour(2F, 0F, 0F));
    }

    @Test
    @DisplayName("A constructor should take one parameter of integer values between 0x000000 to 0xFFFFFF")
    void constructorOneParameter() {
        Colour c0 = new Colour(0x0);
        Colour c1 = new Colour(0xFF00FF);
    }

    @Test
    @DisplayName("A constructor should throw IllegalArgumentException if passed in one parameter, and its value is not " +
            "between 0x000000 and 0xFFFFFF")
    void constructorOneParameterThrowOutOfRange() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Colour(0xFFFFFF0));
        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> new Colour(-1));
    }

}


