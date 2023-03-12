package com.gui.window;

public class TemperatureConverter {

  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  public static double celsiusToKelvin(double celsius) {
    return celsius + 273.15;
  }

  public static double kelvinToCelsius(double kelvin) {
    return kelvin - 273.15;
  }

  public static double fahrenheitToKelvin(double fahrenheit) {
    double celsius = fahrenheitToCelsius(fahrenheit);
    return celsiusToKelvin(celsius);
  }

  public static double kelvinToFahrenheit(double kelvin) {
    double celsius = kelvinToCelsius(kelvin);
    return celsiusToFahrenheit(celsius);
  }

public static double convertCelsiusToFahrenheit(double temperature) {
	// TODO Auto-generated method stub
	return 0;
}

public static double convertFahrenheitToCelsius(double temperature) {
	// TODO Auto-generated method stub
	return 0;
}

}
