package homework_project;

public class NoSuchCurrencyException extends Exception{
    public NoSuchCurrencyException (String currencyName) {
        super("Данная валюта не поддердживается конвертером");
    }
}
