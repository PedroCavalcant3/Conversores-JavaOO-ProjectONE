package logicaConversorTemperatura;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import controlador.ConversorGUI;

public class DialogoTemperatura {
	String tipoConversao;
	String input;
	
	servicoConversaoTermometrica escala = new servicoConversaoTermometrica();
	
	public void dialogo(ActionEvent e) {

		String  []  opcoesConversao  = {"Fahrenheit para Celsius", "Fahrenheit para Kelvin", 
				"Celsius para Fahrenheit", "Celsius para Kelvin", 
				"Kelvin para Celsius", "Kelvin para Fahrenheit"}; 
		
		tipoConversao = (String) JOptionPane.showInputDialog(null,
				"Escolha ", "Seleção de escalas da termometria",
				JOptionPane.PLAIN_MESSAGE, null, opcoesConversao, "0");
		
		if (tipoConversao == null)
			return;

		String message = ("Digite o quanto deseja converter " + tipoConversao);
		input = JOptionPane.showInputDialog(message);
		if (input == null)
			return;
		double valor = Double.valueOf(input).doubleValue();
		switch (tipoConversao) {

		case "Fahrenheit para Celsius": {

			escala.ConvertFahrenheitToCelsius(valor);				
			break;
			} 
		

		case "Fahrenheit para Kelvin": {
			escala.ConvertFahrenheitTokelvin(valor);				
			break;
			} 
		
		case "Celsius para Fahrenheit": {
			escala.ConvertCelsiusToFahrenheit(valor);				
			break;
			
		}
		case "Celsius para Kelvin": {
			escala.ConvertCelsiusToKelvin(valor);				 
			break;
	
		}
		case "Kelvin para Celsius": {
			escala.ConvertKelvinToCelsius(valor);				
			break;
		}

		case "Kelvin para Fahrenheit": {
			escala.ConvertKelvinToFahrenheit(valor);				
			break;
		}
		default:
			break;
		}
			ConversorGUI conversorGUI = new ConversorGUI();
			conversorGUI.continuar(2);
	}

}
