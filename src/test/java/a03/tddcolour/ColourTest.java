package a03.tddcolour;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ColourTest {
    @Test
    @DisplayName("A constructor should take any combination of three parameters of float values between 0.0 to 1.0.")
    void constructorTakeThreeFloat() {
        Colour c0 = new Colour(0F, 0F, 0F);
        Colour c1 = new Colour(1F, 1F, 1F);
    }

    @Test
    @DisplayName("A constructor should throw IllegalArgumentException if any of the parameter value is not between 0.0 and 1.0")
    void constructorThrowOutOfRange() {
        Exception exception =  assertThrows(IllegalArgumentException.class, () -> new Colour(2F, 0F, 0F));
    }

}


