package edu.simanavets.java.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondsAndMinutesTests {

    @ParameterizedTest(name = "{0}m, {1}s => {2}")
    @CsvSource({
            "-15, 5, Invalid value",
            "0, -6, Invalid value",
            "0, 62, Invalid value",
            "-10, -2, Invalid value",
            "0, 0, 00h 00m 00s",
            "0, 3, 00h 00m 03s",
            "59, 0, 00h 59m 00s",
            "60, 0, 01h 00m 00s",
            "1456, 50, 24h 16m 50s",
            "7259, 10, 120h 59m 10s"
    })
    void shouldCalculateTimeFromMinutesAndSeconds(int minutes, int seconds, String expectedResult) {
        assertEquals(
                expectedResult,
                SecondsAndMinutes.getDurationString(minutes, seconds));
    }

    @ParameterizedTest(name = "{0}s => {1}")
    @CsvSource({
            "-15, Invalid value",
            "0, 00h 00m 00s",
            "3, 00h 00m 03s",
            "3540, 00h 59m 00s",
            "3600, 01h 00m 00s",
            "87410, 24h 16m 50s",
            "435550, 120h 59m 10s"
    })
    void shouldCalculateTimeFromSeconds(int seconds, String expectedResult) {
        assertEquals(
                expectedResult,
                SecondsAndMinutes.getDurationString(seconds));
    }
}
