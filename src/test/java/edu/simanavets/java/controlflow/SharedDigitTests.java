package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharedDigitTests {

    @ParameterizedTest
    @CsvSource({
            "12, 23, true",
            "9, 99, false",
            "15, 55, true",
            "12, -9, false"
    })
    void shouldFindSharedDigits(int first, int second, boolean expectedResult) {
        assertEquals(
                expectedResult,
                SharedDigit.hasSharedDigit(first, second));
    }
}
