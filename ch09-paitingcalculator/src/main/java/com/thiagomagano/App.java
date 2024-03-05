package com.thiagomagano;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Challenge 09 - Paiting Calculator");

        Scanner in = new Scanner(System.in);

        System.out.print("Width: ");
        int w = in.nextInt();
        System.out.print("Length: ");
        int l = in.nextInt();

        CalcPaint calc = new CalcPaint(w, l);

        String gallonStr = " gallons";
        if (calc.QtdGallonsToCover <= 1) {
            gallonStr = " gallon";
        }
        System.out.println("\nYou need to purchase " + calc.QtdGallonsToCover + gallonStr + " of paint to cover "
                + calc.squareFeet + " square feet.\n");

        in.close();

    }
}
