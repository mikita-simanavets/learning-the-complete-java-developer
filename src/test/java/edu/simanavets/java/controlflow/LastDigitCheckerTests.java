package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastDigitCheckerTests {

    @ParameterizedTest
    @CsvSource({
            "41, 22, 71, true",
            "23, 32, 42, true",
            "9, 99, 999, false",
            "777, 771, 77, true"
    })
    void shouldCheckIfNumbersHasSameLastDigit(int first, int second, int third, boolean expectedResult) {
        assertEquals(
                expectedResult,
                LastDigitChecker.hasSameLastDigit(first, second, third));
    }
}
