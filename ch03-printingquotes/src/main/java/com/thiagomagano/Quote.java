package com.thiagomagano;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Quote {
    String author = "Uknow";
    String quote = "Nada Disse";

    Map<String, String> mapOfQuotes = new HashMap<>();

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public Quote() {

    }

    public String printQuote(String quote, String author) {
        if (quote == "" || author == "") {
            return this.author + " says, " + "\"" + this.quote + "\"";
        }
        return author + " says, " + "\"" + quote + "\"";
    }

    public String RandomQuote() {

        mapOfQuotes.put("All i know is that i know nothing", "Sócrates");
        mapOfQuotes.put("With great power there must also comes great responsability", "Uncle Ben");
        mapOfQuotes.put("So Beautiful", "Mom");
        mapOfQuotes.put("O Impossível é só questão de opinião", "Chorão CBJR");
        mapOfQuotes.put("O Impossível é só questão de opinião", "Chorão CBJR");

        Random r = new Random();
        int randomIndex = r.nextInt(mapOfQuotes.size());

        String randomQuote = (String) mapOfQuotes.keySet().toArray()[randomIndex];

        String author = mapOfQuotes.get(randomQuote);

        return printQuote(randomQuote, author);
    }
}
