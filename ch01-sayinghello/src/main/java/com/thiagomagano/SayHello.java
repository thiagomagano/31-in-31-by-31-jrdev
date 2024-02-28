package com.thiagomagano;

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

}
