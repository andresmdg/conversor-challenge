package com.exchange.currencies;

import java.util.HashMap;
import java.util.Map;

public class CurrencyFactory {
    private static Map<String, Currency> currencies = new HashMap<>();

    static {
    	  currencies.put("USD", new Currency("USD", "US Dollar", new HashMap<>()));
    	  currencies.put("EUR", new Eur("EUR", "Euro", new HashMap<>()));
    	  currencies.put("JPY", new Jpy("JPY", "Japanese Yen", new HashMap<>()));
    	  currencies.put("GBP", new Gbp("GBP", "British Pound", new HashMap<>()));
    	  currencies.put("KPW", new Kpw("KPW", "North Korean Won", new HashMap<>()));
    	  currencies.put("MXN", new Mxn("MXN", "Mexican Peso", new HashMap<>()));
    	}


    public static Currency getCurrency(String currencyCode) {
        return currencies.get(currencyCode);
    }
      

}