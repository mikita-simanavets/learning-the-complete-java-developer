package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitSumChallengeTests {

    @ParameterizedTest
    @CsvSource({
            "128, 11",
            "1000, 1",
            "1, -1",
            "-5, -1"
    })
    void shouldSumDigitsInNumber(int number, int expectedResult) {
        assertEquals(
                expectedResult,
                DigitSumChallenge.sumDigits(number));
    }
}
