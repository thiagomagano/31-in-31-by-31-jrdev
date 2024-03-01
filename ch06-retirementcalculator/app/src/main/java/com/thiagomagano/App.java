package com.thiagomagano;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Challenge 06 - Retirement Calculator");

        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int age = in.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retirementAge = in.nextInt();

        RetirementCalculator calc = new RetirementCalculator(age, retirementAge);

        System.out.println(calc.printRetirementMessage());

        in.close();
    }
}
