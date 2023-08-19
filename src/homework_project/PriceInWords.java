package homework_project;

import java.util.Scanner;

public class PriceInWords {
    private static Currency currency;
    private static int price;
    public static void main(String[] args) throws NoSuchCurrencyException {
        ConverterValueToString converterValueToString = new ConverterValueToString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите валюту. Доступные валюты - " + Currency.getSupportedCurrency());
        String currencyName = scanner.nextLine();
        currency = Currency.getCurrency(currencyName);
        System.out.println("Ввведите сумму цифрами");
        try {
            price = Integer.parseInt(scanner.nextLine());
            String resultOfConvertation = converterValueToString.convert(currency, price);
            System.out.println(resultOfConvertation);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("некорректный формат ввода, необходимо вводить только цифры");
        }

    }

}
