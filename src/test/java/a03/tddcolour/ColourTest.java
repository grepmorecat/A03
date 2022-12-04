package a03.tddcolour;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("Test constructor stores rgb information correctly")
    void constructorStoreCorrectly() {
        Colour c0 = new Colour(0.55F, 0.55F, 0.55F);
        assertEquals(0.55F, c0.red);
        assertEquals(0.55F, c0.green);
        assertEquals(0.55F, c0.blue);
        Colour c1 = new Colour(0xF0F0F0);
        assertEquals(0.9411764706F, c1.red);
        assertEquals(0.9411764706F, c1.green);
        assertEquals(0.9411764706F, c1.blue);
    }

    @Test
    @DisplayName("If same component values, two colours should be equal")
    void twoObjectEqualIfSameComponent() {
        Colour c0 = new Colour(0.55F, 0.55F, 0.55F);
        Colour c1 = new Colour(0.55F, 0.55F, 0.55F);
        assertEquals(c0, c1);
        Colour c3 = new Colour(0xF0F0F0);
        Colour c2 = new Colour(0xF0F0F0);
        assertEquals(c2, c3);
        Colour c4 = new Colour(0xF1F0F0);
        Colour c5 = new Colour(0xF0F0F0);
        assertNotEquals(c4, c5);
        assertNotEquals(c4, new Object());
    }


}


