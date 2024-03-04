package com.thiagomagano;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Challenge 08 - Pizza Party");

        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = in.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = in.nextInt();

        int piecesPizza = 8;

        PizzaCalculator pizzaCalc = new PizzaCalculator(people, pizzas, piecesPizza);

        if (pizzaCalc.numPizza > 1) {
            System.out.printf("%d people with %d pizzas \n", pizzaCalc.numPeople, pizzaCalc.numPizza);
        } else {
            System.out.printf("%d people with %d pizza \n", pizzaCalc.numPeople, pizzaCalc.numPizza);
        }
        if (pizzaCalc.piecesForPeople > 1) {
            System.out.println("Each person gets " + pizzaCalc.piecesForPeople + " pieces of pizza.");
        } else {
            System.out.println("Each person gets " + pizzaCalc.piecesForPeople + " piece of pizza.");
        }

        System.out.println("There are " + pizzaCalc.leftover + " leftover pieces");

    }
}
