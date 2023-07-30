package com.views;
import com.controllers.currencys.FunctionCurrency;
import com.controllers.temperature.FunctionTemperature;

import javax.swing.JOptionPane;
public class Main {
    public static void main (String[] args) throws NullPointerException{

        FunctionCurrency functionCurrency = new FunctionCurrency();
        FunctionTemperature functionTemperature = new FunctionTemperature();

        while (true){
            String option = JOptionPane.showInputDialog(null,
                    "What do you want to convert: ",
                    "Converter Menu",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new Object[]{
                            "Currency Convert",
                            "Temperature Convert"
                    },
                    "Selected").toString();

            switch(option){
                case "Currency Convert":
                    double value = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value to convert: "));
                    functionCurrency.convertCurrency(value);

                    int reply = JOptionPane.showConfirmDialog(null, "Do you want to make another conversion? ");
                    if(JOptionPane.OK_OPTION == reply) System.out.println("Choose an affirmative reply");
                    else JOptionPane.showMessageDialog(null, "End of the program");
                    break;

                case ("Temperature Convert"):
                    double temperature = Double.parseDouble(JOptionPane.showInputDialog( "Please enter a temperature to convert"));
                    functionTemperature.convertTemperature(temperature);

                    reply = JOptionPane.showConfirmDialog(null, "Do you want to make another conversion?");
                    if(JOptionPane.OK_OPTION == reply) System.out.println("Choose an affirmative reply");
                    else JOptionPane.showMessageDialog(null, "End of the program");
                    break;

            }

        }



    }
}
