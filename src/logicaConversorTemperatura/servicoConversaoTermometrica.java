package logicaConversorTemperatura;

import javax.swing.JOptionPane;

public class servicoConversaoTermometrica {
	
    public void ConvertCelsiusToFahrenheit(double temperatura){
        double fahrenheit = (temperatura * 1.8) + 32;
        fahrenheit = formatar(fahrenheit);
        JOptionPane.showMessageDialog(null, temperatura +" Celsius convertidos retornam " + fahrenheit + " Fahrenheit ");
    }
    public double ConvertFahrenheitToCelsius(double temperatura){
        double celsius = (temperatura - 32)/1.8;
        celsius = formatar(celsius);
        JOptionPane.showMessageDialog(null, temperatura +" Fahrenheit convertidos retornam " + celsius + " Celsius ");
		return celsius;
    }
    public void ConvertCelsiusToKelvin(double temperatura){
        double kelvin = temperatura + 273;
        kelvin = formatar(kelvin);
        JOptionPane.showMessageDialog(null, temperatura +" Celsius convertidos retornam " + kelvin + " kelvin ");
    }
    public void ConvertKelvinToCelsius(double temperatura){
        double celsius = temperatura - 273;
        celsius = formatar(celsius);
        JOptionPane.showMessageDialog(null, temperatura +" Kelvin convertidos retornam " + celsius + " Celsius ");
    }
    public void ConvertFahrenheitTokelvin(double temperatura){
        double kelvin = (temperatura - 32) * 5/9 + 273;
        kelvin = formatar(kelvin);
        JOptionPane.showMessageDialog(null, temperatura +" Fahrenheit convertidos retornam " + kelvin + " kelvin ");
    }
    public void ConvertKelvinToFahrenheit(double temperatura){
        double fahrenheit = (temperatura - 273) * 1.8 + 32;
        fahrenheit = formatar(fahrenheit);
        JOptionPane.showMessageDialog(null, temperatura +" Kelvin convertidos retornam " + fahrenheit + " Fahrenheit ");
    }
    
    public double formatar(double tipo) {
    	return tipo = (double) Math.round(tipo * 100d) / 100;
    }

}
