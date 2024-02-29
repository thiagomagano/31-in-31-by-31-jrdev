package com.thiagomagano;

public class Game {
    String blankSentence;

    String noun;
    String verb;
    String adjective;
    String adverb;

    public Game() {
    }

    public Game(String noun, String verb, String adjective, String adverb) {
        this.noun = noun;
        this.verb = verb;
        this.adjective = adjective;
        this.adverb = adverb;

        this.blankSentence = "Do your %s your %s %s %s? That's hilarious";
    }

    public String play() {
        return this.blankSentence.formatted(verb, adjective, noun, adverb);
    }
}
