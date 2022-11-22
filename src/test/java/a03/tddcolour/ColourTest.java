package a03.tddcolour;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class ColourTest {
    @Test
    @DisplayName("A constructor should take any combination of three parameters of float values between 0.0 to 1.0.")
    void constructorTakeThreeFloat() {
        Colour c0 = new Colour(0F, 0F, 0F);
        Colour c1 = new Colour(1F, 1F, 1F);
    }
}


