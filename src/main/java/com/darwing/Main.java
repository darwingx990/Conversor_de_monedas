package com.darwing;

import com.darwing.model.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String apiKey = "b7677f21e5df72466d604fa7";
        String currencyOrigin;
        String currencyToConvert;
        double amount;
        double result;

        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("|   Welcome to Currency Converter   |");
        System.out.println("------------------------------------");
        try {

            while (true) {
                System.out.println("Enter the currency you wish to exchange: ");
                currencyOrigin = scan.nextLine().toUpperCase();

                System.out.println("Enter the currency you wish to convert to: ");
                currencyToConvert = scan.nextLine().toUpperCase();

                System.out.println("Enter the amount you wish to convert to: ");
                amount = scan.nextDouble();

                scan.nextLine();

                CurrencyConverter converter = new CurrencyConverter(apiKey);
                result = converter.convertCurrency(currencyOrigin, currencyToConvert, amount);
                if (result != -1) {
                    System.out.printf("%.2f %s%n equals to: %.2f %s%n", amount, currencyOrigin, result, currencyToConvert);
                } else {
                    System.out.println("Unable to do the conversion. Verified the data entered and try again.");
                }

                System.out.print("¿Do you want to make another conversion? (Y/N): ");
                String continueOption = scan.nextLine().toLowerCase();
                if (!continueOption.equals("y")) {
                    if (continueOption.equals("n")) {
                        break;
                    } else {
                        System.out.println("Invalid option. Please try again.");
                        break;
                    }
                }
            }
        }catch (Exception e) {
            System.out.println("You entered an iInvalid data: Please try again whilr. "+ e.getMessage());
        }

        System.out.println("¡Thanks for using our 'Currency Converter app'. See you soon!");
        scan.close();
    }
}