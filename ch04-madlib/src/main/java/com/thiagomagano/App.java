package com.thiagomagano;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Challenge 04 - Mad Lib\n\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = sc.nextLine();

        Game madlib = new Game(noun, verb, adjective, adverb);

        System.out.println("\n\n" + madlib.play() + "\n\n");

        sc.close();
    }
}
