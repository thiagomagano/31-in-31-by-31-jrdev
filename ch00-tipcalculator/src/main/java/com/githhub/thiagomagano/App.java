package com.githhub.thiagomagano;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Tip Calculator!");

        Scanner sc = new Scanner(System.in);

        double billAmount = 0;
        int tipRate = 0;

        try {
            System.out.print("Quanto deu a conta, meu Chapa? ");
            String inputAmount = sc.nextLine();

            billAmount = Double.parseDouble(inputAmount);

            System.out.print("Qual é a porcentagem da gorjeta? ");
            String inputTipRate = sc.nextLine();

            tipRate = Integer.parseInt(inputTipRate);

        } catch (Exception e) {
            System.out.println("Error! Bill Amount Must be a valid value");
            System.exit(0);
        }

        TipCalculator tc = new TipCalculator(billAmount, tipRate);

        System.out.println("O valor da Gorjeta é de: $" + tc.tipValue);
        System.out.println("O valor total da conta é : $" + tc.billTotal);

        sc.close();

    }
}
