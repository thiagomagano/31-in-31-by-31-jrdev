package com.thiagomagano;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Room {
    double length;
    double width;

    final double CONVERSION_FACTOR = 0.09290304;

    public Room(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcSquare() {
        return length * width;
    }

    public BigDecimal convertArea(String op) {
        double area = calcSquare();
        BigDecimal convertedArea;

        if (op.equals("feet")) {
            convertedArea = BigDecimal.valueOf(area * this.CONVERSION_FACTOR);
        } else {
            convertedArea = BigDecimal.valueOf(area / this.CONVERSION_FACTOR);
        }

        return convertedArea.setScale(3, RoundingMode.HALF_UP);
    }

}
