package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlourPackTests {

    @ParameterizedTest
    @CsvSource({
            "1, 0, 6, false",
            "1, 0, 5, true",
            "0, 5, 4, true",
            "2, 2, 12, true",
            "-3, 2, 12, false",
            "2, 1, 5, true",
            "5, 3, 24, false",
            "2, 10, 18, true"
    })
    void shouldCheckIfFlourCanBePacked(int bigCount, int smallCount, int goal, boolean expectedResult) {
        assertEquals(
                expectedResult,
                FlourPack.canPack(bigCount, smallCount, goal));
    }
}
