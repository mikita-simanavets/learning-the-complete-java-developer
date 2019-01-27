package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestCommonDivisorTests {

    @ParameterizedTest
    @CsvSource({
            "25, 15, 5",
            "12, 30, 6",
            "9, 18, -1",
            "81, 153, 9"
    })
    void shouldReturnGreatestCommonDivisor(int first, int second, int expectedResult) {
        assertEquals(
                expectedResult,
                GreatestCommonDivisor.getGreatestCommonDivisor(first, second));
    }
}
