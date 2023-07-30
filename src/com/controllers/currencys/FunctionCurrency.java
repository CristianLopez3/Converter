package com.controllers.currencys;

import com.controllers.currencys.CurrencyConverter;
import com.controllers.currencys.Divisas;

import javax.swing.*;

public class FunctionCurrency{
    CurrencyConverter conversorDivisas = new CurrencyConverter();
    public void convertCurrency(double valueToConvert){
        String option = (JOptionPane.showInputDialog(null,
                "Choose the currency you want to convert: ",
                "Currency",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{
                        "pesos to Dolar",
                        "pesos to Euro",
                        "pesos to Japanese Yen",
                        "pesos to Korean Won",
                        "pesos to Pound Sterling",
                        "dolar to Pesos",
                        "euro to Pesos",
                        "Japanese yen to Pesos",
                        "korean won to Pesos",
                        "pound sterling to Pesos"
                },
                "selection")).toString();

        switch(option){
            case "pesos to Dolar" :
                conversorDivisas.pesosToOtherDivise(valueToConvert, Divisas.DOLAR, "Dolares");
                break;

            case "pesos to Euro" :
                conversorDivisas.pesosToOtherDivise(valueToConvert, Divisas.EURO, "Euros");
                break;

            case "pesos to Japanese Yen" :
                conversorDivisas.pesosToOtherDivise(valueToConvert, Divisas.YEN_JAPONES, "Japanese yens");
                break;

            case "pesos to Korean Won" :
                conversorDivisas.pesosToOtherDivise(valueToConvert, Divisas.WON_SUR_COREANO, "Koren Wons");
                break;

            case "pesos to Pound Sterling" :
                conversorDivisas.pesosToOtherDivise(valueToConvert, Divisas.LIBRAS_ESTERLINAS, "pounds sterling");
                break;

            case "dolar to Pesos" :
                conversorDivisas.otherDiviseToPesos(valueToConvert, Divisas.DOLAR);
                break;

            case "euro to Pesos" :
                conversorDivisas.otherDiviseToPesos(valueToConvert, Divisas.EURO);
                break;

            case "Japanese yen to Pesos" :
                conversorDivisas.otherDiviseToPesos(valueToConvert, Divisas.YEN_JAPONES);
                break;

            case "korean won to Pesos" :
                conversorDivisas.otherDiviseToPesos(valueToConvert, Divisas.WON_SUR_COREANO);
                break;

            case "pound sterling to Pesos" :
                conversorDivisas.otherDiviseToPesos(valueToConvert, Divisas.LIBRAS_ESTERLINAS);
                break;

        }
    }




}
