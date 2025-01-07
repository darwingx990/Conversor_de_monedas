package com.darwing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String apiKey = "b7677f21e5df72466d604fa7";
        String currencyOrigin;
        String currencyToConvert;
        double amount;
        double result;
        String url = "https://v6.exchangerate-api.com/v6/";

        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("|   Welcome to Currency Converter   |");
        System.out.println("------------------------------------");
        System.out.println("Enter the currency you wish to exchange: ");
        currencyOrigin = scan.nextLine().toUpperCase();

        System.out.println("Enter the currency you wish to convert to: ");
        currencyToConvert = scan.nextLine().toUpperCase();

        System.out.println("Enter the amount you wish to convert to: ");
        amount = scan.nextDouble();


        scan.close();

    }
//
//
//    HttpClient client = HttpClient.newHttpClient();
//    HttpRequest request = HttpRequest.newBuilder()
//            .uri(URI.create(url))
//            .GET()
//            .build();
//
//        try
//
//    {
//        HttpResponse<String> response = client
//                .send(request, HttpResponse.BodyHandlers.ofString());
//
//        String jsonBody = response.body();
//        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//                .create();
//
////            TituloDto miTituloDto = gson.fromJson(jsonBody, TituloDto.class);
////            System.out.println(miTituloDto);
//    } catch(
//    Exception e)
//
//    {
//        System.out.println("Ocurrió un Error: " + e.getMessage());
//    }
////        try {
////            HttpResponse<String> respuesta=client.send(request, BodyHandler.asString());
////            System.out.println(respuesta.body());
////        } catch (IOException | InterruptedException e) {
////            // TODO Auto-generated catch block
////            e.printStackTrace();
////        }
////    }
//
//}
}