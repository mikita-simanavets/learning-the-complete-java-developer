package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstAndLastDigitSumTests {

    @ParameterizedTest
    @CsvSource({
            "252, 4",
            "257, 9",
            "9572459, 18",
            "0, 0",
            "5, 10",
            "-10, -1",
            "10, 1"
    })
    void shouldSumFirstAndLastDigits(int number, int expectedResult) {
        assertEquals(
                expectedResult,
                FirstAndLastDigitSum.sumFirstAndLastDigit(number));
    }
}
