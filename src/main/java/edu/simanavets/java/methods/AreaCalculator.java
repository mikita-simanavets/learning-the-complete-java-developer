package edu.simanavets.java.methods;

public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * 3.14159;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}
