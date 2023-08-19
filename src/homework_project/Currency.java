package homework_project;

public abstract class Currency {
    private final String name;
    private static final String supportCurrency = "рубль";

    public Currency(String name){
        this.name = name;
    }

    public abstract String[] getForms();
    public static String getFormCurrency(Currency currency, int number){
        String[] formsCurrency;
        String form = null;

        if (currency != null){
            formsCurrency = currency.getForms();
            if (number > 20 && number < 100){
                number = getLastNumber(number, 10);
            } else {
                number = getLastNumber(number, 100);
                if (number > 20){
                    number = getLastNumber(number, 10);
                }
            }

            if (number == 0 || number >= 5 && number <= 20){
                form = formsCurrency[2];
            } else if (number == 1) {
                form = formsCurrency[0];
            } else if (number > 1 && number < 5){
                form = formsCurrency[1];
            }
            return form;
        }
        return null;
    }

    // Сюда потом можно добавить разных валют
    public static Currency getCurrency(String currencyName) throws NoSuchCurrencyException {
        Currency currency;
        if (currencyName.equalsIgnoreCase("рубль")) {
            currency = new Roubles(currencyName);
        } else {
            throw new NoSuchCurrencyException(currencyName);
        }
        return currency;
    }

    public static Integer getLastNumber(int i, int divider){
        return i % divider;
    }

    public static String getSupportedCurrency(){
        return supportCurrency;
    }
}
