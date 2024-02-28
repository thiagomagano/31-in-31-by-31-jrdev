package com.thiagomagano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n*******************************");
        System.out.println("Challenge 01 - Saiyng Hello");
        System.out.println("*******************************\n\n");

        System.out.println("Whats is your name? ");
        String name = sc.nextLine();

        // System.out.printf("Hello, %s, nice to meet you \n", name);

        String greetings = SayHello.greeting(name);

        System.out.println(greetings);
        System.out.println("\n\n");

        sc.close();
    }
}