
package com.exchange.currencies;

import java.util.HashMap;
import java.util.Map;

public class Currency {

	  private String code;
	  private String name;
	  private Map<Currency, Double> exchangeRates;

	  public Currency(String code, String name, Map<Currency, Double> exchangeRates) {
	    this.code = code;
	    this.name = name;
	    this.exchangeRates = exchangeRates;
	  }

	  public void setExchangeRate(Currency currency, double rate) {
	    exchangeRates.put(currency, rate);
	  }

	  public double getExchangeRate(Currency currency) {
	    return exchangeRates.get(currency);
	  }

	  public String getCode() {
	    return code;
	  }

	  public String getName() {
	    return name;
	  }

	  public double getRate(Currency to) {
	    return exchangeRates.getOrDefault(to, Double.NaN);
	  }

	  public static Currency valueOf(String code) {
	    Currency currency = CurrencyFactory.getCurrency(code);
	    if (currency == null) {
	      throw new IllegalArgumentException("Currency code not recognized: " + code);
	    }
	    return currency;
	  }
	  
	}
