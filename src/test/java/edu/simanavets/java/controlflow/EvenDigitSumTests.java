package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenDigitSumTests {

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "123456789, 20",
            "252, 4",
            "-22, -1"
    })
    void shouldSumEvenDigits(int number, int expectedResult) {
        assertEquals(
                expectedResult,
                EvenDigitSum.getEvenDigitSum(number));
    }
}
