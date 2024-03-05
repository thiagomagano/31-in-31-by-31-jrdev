package com.thiagomagano;

public class CalcPaint {
    int width;
    int length;
    int squareFeet;
    int QtdGallonsToCover;
    final int ONE_GALLON_COVER_SQUARE_FEET = 350;

    public CalcPaint(int w, int l) {
        this.width = w;
        this.length = l;

        this.squareFeet = getSquareFeet(this.width, this.length);

        this.QtdGallonsToCover = getQtdGallonsNeed(this.squareFeet, this.ONE_GALLON_COVER_SQUARE_FEET);
    }

    public static int getSquareFeet(int w, int l) {
        return w * l;
    }

    public static int getQtdGallonsNeed(int squareFeet) {
        final int ONE_GALLON_COVER_SQUARE_FEET = 350;

        return Math.ceilDiv(squareFeet, ONE_GALLON_COVER_SQUARE_FEET);
    }

    public static int getQtdGallonsNeed(int squareFeet, int oneGallonCover) {
        return Math.ceilDiv(squareFeet, oneGallonCover);
    }
}
