package com.exchange.currencies;

import java.util.Map;

public class Jpy extends Currency {

  public Jpy(String code, String name, Map<Currency, Double> exchangeRates) {
    super(code, name, exchangeRates);
    setExchangeRate(CurrencyFactory.getCurrency("USD"), 1.00/110.00);
  }

 // @Override
  public double convert(String toCurrency, String amount) {
    double result = 0;
    try {
      double amountValue = Double.parseDouble(amount);
      Currency to = CurrencyFactory.getCurrency(toCurrency);
      if (to != null) {
        result = amountValue * getExchangeRate(to) / to.getExchangeRate(to);
      } else {
        System.out.println("Currency not supported: " + toCurrency);
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid amount: " + amount);
    }
    return result;
  }
}
