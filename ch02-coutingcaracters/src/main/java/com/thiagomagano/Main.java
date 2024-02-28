package com.thiagomagano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nChallenge 02 - Counting the Number of Characters\n\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String word = sc.nextLine();

        int wordSize = WordCounter.wordCount(word);

        System.out.printf("%s has %d characters\n", word, wordSize);

        sc.close();
    }
}