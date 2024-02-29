package com.thiagomagano;

public class Quote {
    String author;
    String quote;

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public String printQuote() {
        return author + " says, " + "\"" + quote + "\"";
    }
}
