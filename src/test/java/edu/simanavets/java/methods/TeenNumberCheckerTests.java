package edu.simanavets.java.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeenNumberCheckerTests {

    @ParameterizedTest
    @CsvSource({
            "9, 99, 19, true",
            "23, 15, 42, true",
            "22, 23, 34, false"
    })
    void shouldCompareTeens(int first, int second, int third, boolean expectedResult) {
        assertEquals(
                expectedResult,
                TeenNumberChecker.hasTeen(first, second, third));
    }
}
