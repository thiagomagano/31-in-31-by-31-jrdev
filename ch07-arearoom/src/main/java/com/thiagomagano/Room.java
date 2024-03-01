package com.thiagomagano;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Room {
    double length;
    double width;

    final double CONVERSION_FACTOR = 0.09290304;

    public Room(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcSquareFeet() {
        return length * width;
    }

    public BigDecimal convertAreaToMeters() {

        double areaInFeet = calcSquareFeet();

        BigDecimal areaInMeters = BigDecimal.valueOf(areaInFeet * this.CONVERSION_FACTOR);

        return areaInMeters.setScale(3, RoundingMode.HALF_UP);

    }
}
