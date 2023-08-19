package homework_project.tests;

import homework_project.ConverterValueToString;
import homework_project.Currency;
import homework_project.NoSuchCurrencyException;
import homework_project.Roubles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceInWordsTests {
    ConverterValueToString converterValueToString = new ConverterValueToString();

    @Test
    void successConvertation() throws NoSuchCurrencyException {
        String resultOfConvertation = converterValueToString.convert(Currency.getCurrency("рубль"), 5438990);
        String expectedResult = "пять миллионов четыреста тридцать восемь тысяч девятьсот девяносто рублей";
        Assertions.assertEquals(expectedResult, resultOfConvertation);
    }

    @Test
    void checkUnsupportedCurrency() {
        Exception exception = Assertions.assertThrows(NoSuchCurrencyException.class, () -> converterValueToString.convert(Currency.getCurrency("бублики"), 5438990));
        Assertions.assertTrue(exception.getMessage().contains("Данная валюта не поддердживается конвертером"));
    }

    @Test
    void checkPriceIsNotNull() {
        Exception exception = Assertions.assertThrows(NullPointerException.class, () -> converterValueToString.convert(Currency.getCurrency("рубль"), null));
        Assertions.assertTrue(exception.getMessage().contains("\"number\" is null"));
    }

    @Test
    void checkPriceIsNotNegative () {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> converterValueToString.convert(Currency.getCurrency("рубль"), -653));
        Assertions.assertTrue(exception.getMessage().contains("Сумма не может быть меньше или равна 0"));
    }
    @Test
    void checkCorrectCurrencyForm () {
        String expectResult = "рублей";
        Roubles roubles = new Roubles("рубль");
        String result = Currency.getFormCurrency(roubles, 125);
        Assertions.assertEquals(expectResult, result);
    }

}
