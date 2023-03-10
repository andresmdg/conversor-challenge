package com.exchange.currencies;

public abstract class Currency {

  protected Double rate;
  protected String name;

  public Currency (String name, Double rate) {
    this.rate = rate;
    this.name = name;
  }
    
  public String getName() {
    return this.name;
  }
  
  public Double getRate() {
    return this.rate;
  }

  public abstract double convert(String currency, String amount);
  
}