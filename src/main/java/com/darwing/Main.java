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
        System.out.println("Press 'Enter' to continue...");
        scan.nextLine();
        while (true) {
            String[][] currencies = {
                    {"USD", "Dólar estadounidense"},
                    {"EUR", "Euro"},
                    {"JPY", "Yen japonés"},
                    {"GBP", "Libra esterlina"},
                    {"AUD", "Dólar australiano"},
                    {"CAD", "Dólar canadiense"},
                    {"CHF", "Franco suizo"},
                    {"CNY", "Yuan chino"},
                    {"HKD", "Dólar de Hong Kong"},
                    {"NZD", "Dólar neozelandés"},
                    {"SEK", "Corona sueca"},
                    {"KRW", "Won surcoreano"},
                    {"SGD", "Dólar singapurense"},
                    {"NOK", "Corona noruega"},
                    {"MXN", "Peso mexicano"},
                    {"INR", "Rupia india"},
                    {"RUB", "Rublo ruso"},
                    {"ZAR", "Rand sudafricano"},
                    {"TRY", "Lira turca"},
                    {"BRL", "Real brasileño"}
            };
            int half = currencies.length / 2 + currencies.length % 2;
            for (int i = 0; i < half; i++) {
                String col1 = String.format("%-20s", currencies[i][0] + " - " + currencies[i][1]);
                String col2 = (i + half < currencies.length)
                        ? currencies[i + half][0] + " - " + currencies[i + half][1]
                        : "";
                System.out.printf("%-35s %s%n", col1, col2);
            }
                System.out.println("Enter the currency you wish to exchange: ");
                System.out.println("(Write only the three (3) letters on the left)");
                currencyOrigin = scan.nextLine().toUpperCase();

                System.out.println("Enter the currency you wish to convert to: ");
                System.out.println("(Write only the three (3) letters on the left)");
                currencyToConvert = scan.nextLine().toUpperCase();
            try {

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
            } catch (Exception e) {
                System.out.println("You entered an Invalid amount. Please try again.");
                break;
            }
            System.out.print("¿Do you want to make another conversion? (Y/N): ");
            String continueOption = scan.nextLine().toLowerCase();
            if (!continueOption.equals("y")) {
                if (continueOption.equals("yes")) {
                    continue;
                } else if (continueOption.equals("n")) {
                    break;
                } else {
                    System.out.println("Invalid option. Please try again.");
                    break;
                }
            }
        }
        System.out.println("¡Thanks for using our 'Currency Converter app'. See you next time!");
        scan.close();
    }
}