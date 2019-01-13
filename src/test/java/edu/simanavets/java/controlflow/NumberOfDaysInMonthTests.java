package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfDaysInMonthTests {

    @ParameterizedTest
    @CsvSource({
            "1, 2020, 31",
            "8, 2019, 31",
            "9, 2019, 30",
            "2, 2020, 29",
            "2, 2018, 28",
            "-1, 2020, -1",
            "1, -2020, -1"
    })
    void shouldReturnCorrectDaysInMonth(int month, int year, int expectedResult) {
        assertEquals(
                NumberOfDaysInMonth.getDaysInMonth(month, year),
                expectedResult);
    }
}
