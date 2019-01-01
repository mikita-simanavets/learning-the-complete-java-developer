package edu.simanavets.java.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearCalculatorTests {

    @ParameterizedTest
    @CsvSource({
            "-1600, false",
            "1600, true",
            "1700, false",
            "2000, true",
            "2019, false",
            "2020, true"
    })
    void shouldCompareByThreeDecimalPlaces(int year, boolean expectedResult) {
        assertEquals(
                LeapYearCalculator.isLeapYear(year), expectedResult);
    }
}
