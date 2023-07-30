package com.controllers.temperature;
import javax.swing.JOptionPane;
public class TemperatureConverter {
    public void celsiusToFahrenheit(double value){
        double fahrenheit = (value * (5/9)) + 32 ;
        fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, value+" celsius to Fahrenheit = "+fahrenheit+" fahrenheit");
    }

    public double fahrenheitToCelsius(double value){
        double celsius = (value - 32) * (5/9);
        celsius = (double) Math.round(celsius * 100d) / 100;
        JOptionPane.showMessageDialog(null, value+" celsius to Fahrenheit = "+celsius+" fahrenheit");
        return celsius;
    }

    public void celsiusToKelvin(double value){
        double kelvin = value + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, value+" celsius to kelvin = "+kelvin+" kelvin");
    }

    public double kelvinToCelsius(double value){
        double celsius = value - 273.15;
        celsius = (double) Math.round(celsius * 100d) / 100;
        JOptionPane.showMessageDialog(null, value+" celsius to celsius = "+ celsius +" celsius");
        return celsius;
    }

    public void fahrenheitToKelvin(double value){
        double kelvin =  fahrenheitToCelsius(value) + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, value +" fahrenheit to kelvin = "+kelvin+" kelvin");
    }

    public void kelvinToFahrenheit(double value){
        double fahrenheit = kelvinToCelsius(value) * (9/5) + 32;
        fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, value+" Kelvin to fahrenheit = "+fahrenheit+" fahrenheit");
    }

}
