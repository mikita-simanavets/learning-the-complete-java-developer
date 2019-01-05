package edu.simanavets.java.methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaCalculatorTests {

    @ParameterizedTest
    @CsvSource({
            "-1.0, 4.0, -1.0",
            "5.0, 4.0, 20.0",
    })
    void shouldCalculateAreaOfRectangle(double x, double y, double expectedResult) {
        assertEquals(
                expectedResult,
                AreaCalculator.area(x, y));
    }

    @ParameterizedTest
    @CsvSource({
            "-1.0, -1.0",
            "5.0, 78.53975",
    })
    void shouldCalculateAreaOfCircle(double radius, double expectedResult) {
        assertEquals(
                expectedResult,
                AreaCalculator.area(radius));
    }
}
