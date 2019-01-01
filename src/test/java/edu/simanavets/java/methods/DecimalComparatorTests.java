package edu.simanavets.java.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalComparatorTests {

    @ParameterizedTest
    @CsvSource({
            "-3.1756, -3.175, true",
            "3.175, 3.176, false",
            "3.0, 3.0, true",
            "3.173, 3.174, false"
    })
    void shouldCompareByThreeDecimalPlaces(double number1, double number2, boolean expectedResult) {
        assertEquals(
                expectedResult,
                DecimalComparator.areEqualByThreeDecimalPlaces(number1, number2));
    }
}
