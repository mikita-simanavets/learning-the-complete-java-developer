package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerfectNumberTests {

    @ParameterizedTest
    @CsvSource({
            "6, true",
            "28, true",
            "5, false",
            "-1, false",
            "0, false"
    })
    void shouldCheckIsPerfectNumber(int number, boolean expectedResult) {
        assertEquals(
                expectedResult,
                PerfectNumber.isPerfectNumber(number));
    }
}
