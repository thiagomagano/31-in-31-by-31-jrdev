package com.thiagomagano;

import java.util.ArrayList;
import java.util.Random;

public class Quote {
    String author = "Unknow";
    String quote = "Nada Disse";
    ArrayList<Quote> listQuotes = new ArrayList<>();

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public Quote() {

    }

    public String printQuote(String quote, String author) {

        return author + " says, " + "\"" + quote + "\"";
    }

    public String printQuote() {

        return this.author + " says, " + "\"" + this.quote + "\"";
    }

    public String RandomQuote() {
        Quote q1 = new Quote("All i know is that i know nothing", "Sócrates");
        Quote q2 = new Quote("With great power there must also comes great responsability", "Uncle Ben");
        Quote q3 = new Quote("So Beautiful", "Mom");
        Quote q4 = new Quote("O Impossível é só questão de opinião", "Chorão CBJR");
        Quote q5 = new Quote("Well Done is better than well said", "Beijamin Frankilin");

        listQuotes.add(q1);
        listQuotes.add(q2);
        listQuotes.add(q3);
        listQuotes.add(q4);
        listQuotes.add(q5);

        Random r = new Random();
        int randomIndex = r.nextInt(listQuotes.size());

        Quote randomQuote = listQuotes.get(randomIndex);

        return printQuote(randomQuote.quote, randomQuote.author);
    }
}
