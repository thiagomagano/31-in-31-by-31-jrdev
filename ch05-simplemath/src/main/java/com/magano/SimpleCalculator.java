package com.magano;

public class SimpleCalculator {
    int numX;
    int numY;

    public SimpleCalculator(int x, int y) {
        this.numX = x;
        this.numY = y;
    }

    public SimpleCalculator() {
    }

    public int add() {
        return this.numX + this.numY;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public int sub() {
        return this.numX - this.numY;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public int multi() {
        return this.numX * this.numY;
    }

    public static int multi(int x, int y) {
        return x * y;
    }

    public int divide() {
        return this.numX / this.numY;
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}
