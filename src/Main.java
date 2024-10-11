import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
    boolean run = true;
    Scanner keyword = new Scanner(System.in);
    while (run) {
        System.out.println("""
                Ingresa alguno de los siguientes valores 
                1. Para cambiar USD to COP.
                2. Para cambiar COP to USD.
                3. Para cambiar BRL to USD.
                4. Para cambiar USD to BRL.
                5. Para cambiar USD to ARS.
                6. Para cambiar ARS to USD.
                0. Para salir.
                """);
        int moneyConversion = keyword.nextInt();
        ExchangeRates exchangeRates = new ExchangeRates();

        switch (moneyConversion) {
            case  1 -> {
                System.out.println("¿Cuántos dólares quieres cambiar a peso colombiano?");
                Double valueToExchange = keyword.nextDouble();
                Double valueConverted = exchangeRates.conversionMoney("USDCOP", valueToExchange);
                System.out.println(valueConverted);

            } case 2 -> {
                System.out.println("¿Cuántos pesos colombianos quieres cambiar a USD?");
                Double valueToExchange = keyword.nextDouble();
                Double valueConverted = exchangeRates.conversionMoney("COPUSD", valueToExchange);
                System.out.println(valueConverted);
            } case 3 -> {
                System.out.println("¿Cuántos reales brasileños quieres cambiar a USD?");
                Double valueToExchange = keyword.nextDouble();
                Double valueConverted = exchangeRates.conversionMoney("BRLUSD", valueToExchange);
                System.out.println(valueConverted);
            } case 4 -> {
                System.out.println("¿Cuántos dólares quieres cambiar a BRL?");
                Double valueToExchange = keyword.nextDouble();
                Double valueConverted = exchangeRates.conversionMoney("USDBRL", valueToExchange);
                System.out.println(valueConverted);
            } case 5 -> {
                System.out.println("¿Cuántos dólares quieres cambiar a Peso Argentino?");
                Double valueToExchange = keyword.nextDouble();
                Double valueConverted = exchangeRates.conversionMoney("USDARS", valueToExchange);
                System.out.println(valueConverted);
            } case 6 -> {
                System.out.println("¿Cuántos pesos argentinos quieres a USD?");
                Double valueToExchange = keyword.nextDouble();
                Double valueConverted = exchangeRates.conversionMoney("ARSUSD", valueToExchange);
                System.out.println(valueConverted);
            }
            case 0 -> {
                    System.out.println("Exiting...");
                    run = false;
            }
            default -> {
                System.out.println("Has ingresado una opción incorrecta, " +
                        "verifica por favor las opciones en el menú y vuelve a intentarlo"
                        );
            }
            }
        }
    }
}
