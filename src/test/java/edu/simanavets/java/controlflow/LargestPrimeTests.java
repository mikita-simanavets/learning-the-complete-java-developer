package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPrimeTests {

    @ParameterizedTest
    @CsvSource({
            "21, 7",
            "217, 31",
            "1, -1",
            "45, 5",
            "-1, -1",
            "7, 7"
    })
    void shouldReturnLargestPrime(int number, int expectedResult) {
        assertEquals(
                expectedResult,
                LargestPrime.getLargestPrime(number));
    }
}
