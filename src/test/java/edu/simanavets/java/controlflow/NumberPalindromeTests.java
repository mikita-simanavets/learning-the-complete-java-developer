package edu.simanavets.java.controlflow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberPalindromeTests {

    @ParameterizedTest
    @CsvSource({
            "-1221, true",
            "707, true",
            "11212, false",
            "1, true"
    })
    void shouldCheckIsPalindromeNumber(int number, boolean expectedResult) {
        assertEquals(
                expectedResult,
                NumberPalindrome.isPalindrome(number));
    }
}
