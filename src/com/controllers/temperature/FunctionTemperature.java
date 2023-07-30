package com.controllers.temperature;
import javax.swing.JOptionPane;
public class FunctionTemperature extends TemperatureConverter{
    public void convertTemperature(double temperatureToConvert){

        String option = (JOptionPane.showInputDialog(
                null,
                "Choose the temperature to convert: ",
                "Temperatures",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{
                        "celsius To Fahrenheit",
                        "fahrenheit To Celsius",
                        "celsius To Kelvin",
                        "kelvin To Celsius",
                        "fahrenheit To Kelvin",
                        "kelvin To Fahrenheit"
                },
                "Selected"
        )).toString();

        switch(option){
            case "celsius To Fahrenheit" :
                celsiusToFahrenheit(temperatureToConvert);
                break;

            case "fahrenheit To Celsius" :
                fahrenheitToCelsius(temperatureToConvert);
                break;

            case "celsius To Kelvin" :
                celsiusToKelvin(temperatureToConvert);
                break;

            case "kelvin To Celsius" :
                kelvinToCelsius(temperatureToConvert);
                break;

            case"fahrenheit To Kelvin" :
                fahrenheitToKelvin(temperatureToConvert);
                break;

            case "kelvin To Fahrenheit" :
                kelvinToFahrenheit(temperatureToConvert);

        }
    }
}
