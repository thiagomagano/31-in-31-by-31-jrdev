package com.thiagomagano;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SayHello {
    private String name;
    private String greetingMenssage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreetingMenssage() {
        return greetingMenssage;
    }

    public void setGreetingMenssage(String greetingMenssage) {
        this.greetingMenssage = greetingMenssage;
    }

    public static String greeting(String name) {

        return "Hello, " + name + ", nice to meet you!";
    }

    public static String randomGreeting(String name) {
        List<String> greetings = new ArrayList<>();

        greetings.add("Hello " + name + ", nice to meet you!");
        greetings.add("Hi " + name + ", Good to see you!");
        greetings.add("Oi " + name + ", Aqui é do Brasil!");
        greetings.add("Hola! " + name + ", aquí es de México!");
        greetings.add("Salut " + name + ", ici est de France!");

        Random random = new Random();

        int randomIndex = random.nextInt(greetings.size());

        return greetings.get(randomIndex);

    }

}
