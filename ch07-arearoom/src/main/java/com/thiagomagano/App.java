package com.thiagomagano;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        boolean isValidOption = false;
        Room room;

        String title = "Challenge 07 - Area of a retangular room!";
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("*");
            if (i == title.length() - 1) {
                System.out.println("\n\n");
            }
        }

        Scanner in = new Scanner(System.in);

        while (!isValidOption) {
            System.out.println("""
                    Choose a metric to calculate the square area:

                    [1] - Feet
                    [2] - Meters

                    [0] - Exit
                                """);
            String op = in.nextLine();

            switch (op) {
                case "0":
                    System.out.println("Exiting....");
                    System.exit(0);

                case "1":
                    isValidOption = true;

                    System.out.print("What is the length of the room in feet? ");
                    length = Double.parseDouble(in.nextLine());

                    System.out.print("What is the width of the room in feet? ");
                    width = Double.parseDouble(in.nextLine());

                    room = new Room(length, width);

                    System.out.println("The area is");
                    System.out.println(room.calcSquare() + " square meters");
                    System.out.println(room.convertArea("feet") + " square meters");

                    break;
                case "2":
                    isValidOption = true;
                    System.out.print("What is the length of the room in meters? ");
                    length = Double.parseDouble(in.nextLine());

                    System.out.print("What is the width of the room in meters? ");
                    width = Double.parseDouble(in.nextLine());

                    room = new Room(length, width);

                    System.out.println("The area is");
                    System.out.println(room.calcSquare() + " square meters");
                    System.out.println(room.convertArea("meters") + " square feet");

                default:
                    System.out.println("\nInvalid option! try again \n");

                    // System.exit(1);
                    break;
            }
        }

        in.close();
    }
}
