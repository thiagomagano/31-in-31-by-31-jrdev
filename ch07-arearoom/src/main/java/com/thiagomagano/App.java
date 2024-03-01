package com.thiagomagano;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String title = "Challenge 07 - Area of a retangular room!";
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("*");
            if (i == title.length() - 1) {
                System.out.println("\n\n");
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double length = Double.parseDouble(in.nextLine());

        System.out.print("What is the width of the room in feet? ");
        double width = Double.parseDouble(in.nextLine());

        Room room = new Room(length, width);

        System.out.println("The area is");
        System.out.println(room.calcSquareFeet() + " square feet");
        System.out.println(room.convertAreaToMeters() + " square meters");
    }
}
