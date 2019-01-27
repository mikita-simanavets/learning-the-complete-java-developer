package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberToWordsTests {

    @ParameterizedTest
    @CsvSource({
            "123, 321",
            "100, 1",
            "-2521, -1252",
            "-121, -121",
            "1212, 2121"
    })
    void shouldReverseNumber(int number, int expectedResult) {
        assertEquals(
                expectedResult,
                NumberToWords.reverse(number));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "100, 3",
            "123, 3",
            "-12, -1",
            "5200, 4"
    })
    void shouldReturnCountOfNumberDigits(int number, int expectedResult) {
        assertEquals(
                expectedResult,
                NumberToWords.getDigitCount(number));
    }
}
