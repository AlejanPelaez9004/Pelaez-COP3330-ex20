/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        float amount = input.nextFloat();
        System.out.print("What state do you live in? ");
        String state = input.next();

        float tax = 0;
        if (state.equalsIgnoreCase("Wisconsin"))
        {
            System.out.print("What county do you live in? ");
            String county = input.next();
            tax = 5 / amount;
            if (county.equalsIgnoreCase("Eau Claire"))
                tax += .5f / amount;
            if (county.equalsIgnoreCase("Dunn"))
                tax += .4f / amount;
        }
        if (state.equalsIgnoreCase("Illinois"))
            tax += 8 / amount;

        float total = tax + amount;
        System.out.printf("The tax is: $%.2f.\nThe total is $%.2f.", tax, total);
    }
}
