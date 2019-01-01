package edu.simanavets.java.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BakingDogTests {

    @ParameterizedTest
    @CsvSource({
            "true, 1, true",
            "false, 2, false",
            "true, 8, false",
            "true, -1, false",
            "true, 24, false",
            "true, 22, false"
    })
    void shouldCompareEqualSums(boolean barking, int hourOfDay, boolean expectedResult) {
        assertEquals(
                expectedResult,
                BakingDog.bark(barking, hourOfDay));
    }
}
