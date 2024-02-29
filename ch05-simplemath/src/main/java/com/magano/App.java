package com.magano;

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
        System.out.println("\n\nChallenge 05 - Simple Math\n\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String firstNumInput = sc.nextLine();
        int firstNum = Integer.parseInt(firstNumInput);

        System.out.print("What is the second number? ");
        String secondNumInput = sc.nextLine();
        int secondNum = Integer.parseInt(secondNumInput);

        SimpleCalculator calculator = new SimpleCalculator(firstNum, secondNum);

        System.out.println(calculator.print());
    }
}
