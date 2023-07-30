package com.controllers.currencys;

import javax.swing.*;

public class CurrencyConverter {

    double result;
    public void  pesosToOtherDivise(double value, double divisa, String currency){

        if (!(validateValue(value)))
            JOptionPane.showMessageDialog(null,"Please enter a correct value to convert");

        result = (double) Math.round((value / divisa) * 100d) / 100;
        JOptionPane.showMessageDialog(null, "You have $"+result+" "+currency);

    }

    public void otherDiviseToPesos(double value, double divisa){
        if(!(validateValue(value)))
            JOptionPane.showInputDialog(null, "Plese enter a correct value to convert");

        result = (double) Math.round((value*divisa)*100d)/100;
        JOptionPane.showMessageDialog(null,"You have $"+result+" pesos");
    }
    public boolean validateValue(double value) {
        return value > 0;
    }

}
