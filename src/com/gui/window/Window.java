package com.gui.window;

import javax.swing.*;

import com.exchange.currencies.Convert;
import com.exchange.currencies.Currency;
import com.exchange.currencies.exceptions.CurrencyConversionException;
//import com.exchange.temperatures.TemperatureConverter;

public class Window {

    public static String menu() {

        String message = "Seleccione una opción de conversión";
        String[] options = { "Conversor de monedas", "Conversor de temperaturas", "Salir" };

        int option = JOptionPane.showOptionDialog(null, message, "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (option) {
            case 0:
                return "CURRENCY";
            case 1:
                return "TEMPERATURE";
            case 2:
                return "EXIT";
            default:
                return "EXIT";
        }
    }

    public static void nextWindow(String window) {

        switch (window) {
            case "CURRENCY":
                Currency from = null;
                while (from == null) {
                    String fromCurrency = JOptionPane.showInputDialog(null, "Introduce la moneda de origen:");
                    try {
                        from = Currency.valueOf(fromCurrency.toUpperCase());
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, "La moneda no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                Currency to = null;
                while (to == null) {
                    String toCurrency = JOptionPane.showInputDialog(null, "Introduce la moneda de destino:");
                    try {
                        to = Currency.valueOf(toCurrency.toUpperCase());
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, "La moneda no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                double amount = 0;
                boolean validAmount = false;
                while (!validAmount) {
                    String amountString = JOptionPane.showInputDialog(null, "Introduce la cantidad a convertir:");
                    try {
                        amount = Double.parseDouble(amountString);
                        validAmount = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "La cantidad no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                try {
                    double result = Convert.convert(from, to, amount);
                    JOptionPane.showMessageDialog(null, amount + " " + from.getCode() + " = " + result + " " + to.getCode());
                } catch (CurrencyConversionException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error de conversión", JOptionPane.ERROR_MESSAGE);
                }
                break;

           /* case "TEMPERATURE":
                double temperature = 0;
                boolean validTemperature = false;
                while (!validTemperature) {
                    String temperatureString = JOptionPane.showInputDialog(null, "Introduce la temperatura a convertir:");
                    try {
                        temperature = Double.parseDouble(temperatureString);
                        validTemperature = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "La temperatura no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                String[] options = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int option = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Conversor de temperaturas",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                try { 
                    double result = 0;
                    if (option == 0) {
                        result = TemperatureConverter.convertCelsiusToFahrenheit(temperature);
                        JOptionPane.showMessageDialog(null, temperature + " grados Celsius = " + result + " grados Fahrenheit");
                    } else {
                    	result = TemperatureConverter.convertFahrenheitToCelsius(temperature);
                    	
                    }*/
                
                } 
        }
    }




