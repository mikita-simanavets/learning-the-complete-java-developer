package edu.simanavets.java.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EqualSumCheckerTests {

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1, false",
            "1, 1, 2, true",
            "1, -1, 0, true"
    })
    void shouldCompareEqualSums(int first, int second, int third, boolean expectedResult) {
        assertEquals(
                expectedResult,
                EqualSumChecker.hasEqualSum(first, second, third));
    }
}
