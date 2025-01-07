package com.darwing.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private final String apiKey;
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public CurrencyConverter(String apiKey) {
        this.apiKey = apiKey;
    }

    public double convertCurrency(String currencyOrigin, String currencyToConvert, double amount) {
        try {
            URI uri = URI.create(BASE_URL + apiKey + "/latest/" + currencyOrigin);

            // Create client HTTP
            HttpClient client = HttpClient.newHttpClient();
            //  Create request HTTP
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .GET()
                    .build();

            // Send request and get response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
                JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

                if (conversionRates.has(currencyToConvert)) {
                    double rate = conversionRates.get(currencyToConvert).getAsDouble();
                    return amount * rate;
                } else {
                    System.out.println("Currency not found in our system.");
                }
            } else {
                System.out.println("Error connecting with the API. Status code: " + response.statusCode());
            }
        } catch (Exception e) {
            System.out.println("There was an error: " + e.getMessage());
        }
        return -1;
    }
}