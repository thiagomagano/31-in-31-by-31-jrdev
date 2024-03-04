package com.thiagomagano;

public class PizzaCalculator {
    int numPeople;
    int numPizza;
    int piecesPizza;
    int piecesForPeople;
    int leftover;

    public PizzaCalculator(int people, int pizza, int piecesPizza) {
        this.numPeople = people;
        this.numPizza = pizza;
        this.piecesPizza = piecesPizza;

        this.piecesForPeople = divide(people, pizza, piecesPizza);
        this.leftover = reminder(people, pizza, piecesPizza);

    }

    public static int divide(int people, int pizza, int piecesPizza) {
        return (pizza * piecesPizza) / people;
    }

    public static int reminder(int people, int pizza, int piecesPizza) {
        return (pizza * piecesPizza) % people;
    }
}
