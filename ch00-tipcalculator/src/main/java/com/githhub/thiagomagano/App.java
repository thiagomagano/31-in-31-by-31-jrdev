package com.githhub.thiagomagano;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Tip Calculator!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto deu a conta, meu Chapa? ");
        String inputAmount = sc.nextLine();
        System.out.print("Qual é a porcentagem da gorjeta? ");
        String inputTipRate = sc.nextLine();
 
     

        

        double billAmount = Double.parseDouble(inputAmount);
        int tipRate = Integer.parseInt(inputTipRate);
        

        
        TipCalculator tc = new TipCalculator(billAmount, tipRate);
        

        System.out.println("O valor da Gorjeta é de: $" + tc.tipValue);
        System.out.println("O valor total da conta é : $" + tc.billTotal);

        sc.close();
       
    }
}
