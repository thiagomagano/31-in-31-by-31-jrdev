package com.thiagomagano;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Challenge 03 - Printing Quotes");

        Scanner sc = new Scanner(System.in);

        // System.out.print("What is the quote? ");
        // String quote = sc.nextLine();

        // System.out.print("Who said it? ");
        // String author = sc.nextLine();

        // Quote q = new Quote(quote, author);

        // System.out.println(q.printQuote("", ""));

        Quote q = new Quote();

        System.err.println(q.RandomQuote());

    }
}
