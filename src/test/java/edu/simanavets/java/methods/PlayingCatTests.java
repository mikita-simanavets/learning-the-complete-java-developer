package edu.simanavets.java.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayingCatTests {

    @ParameterizedTest(name = "Is summer: {0}, temperature: {1}, cat should play: {2}")
    @CsvSource({
            "true, 10, false",
            "false, 36, false",
            "false, 35, true",
            "false, 25, true"
    })
    void shouldCheckThatCatIsPlayingOnSummer(boolean summer, int temperature, boolean expectedResult) {
        assertEquals(
                expectedResult,
                PlayingCat.isCatPlaying(summer, temperature));
    }
}
