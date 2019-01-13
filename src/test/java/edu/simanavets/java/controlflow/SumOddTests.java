package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOddTests {

    @ParameterizedTest
    @CsvSource({
            "1, 100, 2500",
            "-1, 100, -1",
            "100, 100, 0",
            "100, -100, -1",
            "100, 1000, 247500"
    })
    void shouldCompareEqualSumOdds(int start, int end, int expectedResult) {
        assertEquals(
                expectedResult,
                SumOdd.sumOdd(start, end));
    }
}
