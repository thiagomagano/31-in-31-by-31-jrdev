package com.thiagomagano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nChallenge 02 - Counting the Number of Characters\n\n");

        Scanner sc = new Scanner(System.in);

        // System.out.print("What is the input string? ");
        String word = "";

        while (Word.wordCount(word) < 1) {
            System.out.print("What is the input string? ");
            word = sc.nextLine();
            if (Word.wordCount(word) < 1) {
                System.out.println("You Must type any word");
            }
        }

        System.out.printf("%s has %d characters\n", word, Word.wordCount(word));

        sc.close();
    }
}