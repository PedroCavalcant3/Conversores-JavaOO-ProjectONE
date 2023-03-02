package logicaConversorEnergia;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import controlador.ConversorGUI;

public class DialogoEnergia {
	public void dialogo(ActionEvent e) {
		String tipoConversao;
		String input;
		
		ServicoConversaoEnergia escala = new ServicoConversaoEnergia();

		String  []  opcoesConversao  = {"Conversor De Watt hora para Joule", "Conversor De Watt hora para Kilojoule", 
				"Conversor De Watt hora para Megajoule", "Conversor De Watt hora para Caloria", 
				"Conversor De Watt hora para Metro Newton", "Conversor De Watt hora para Libra do pé","Conversor De Watt hora para Quilowatt hora","Conversor De Watt hora para Megawatt hora","Conversor De Watt hora para Mega elétron volt"}; 
		
		tipoConversao = (String) JOptionPane.showInputDialog(null,
				"Escolha ", "Seleção de escalas da física",
				JOptionPane.PLAIN_MESSAGE, null, opcoesConversao, "0");
		
		if (tipoConversao == null)
			return;

		String message = ("Digite o quanto deseja converter " + tipoConversao);
		input = JOptionPane.showInputDialog(message);
		if (input == null)
			return;
		double valor = Double.valueOf(input).doubleValue();
		switch (tipoConversao) {

		case "Conversor De Watt hora para Joule": {

			escala.WattHoraToJoule(valor);				
			break;
			} 
		

		case "Conversor De Watt hora para Kilojoule": {
			escala.WattHoraToKilojoule(valor);				
			break;
			} 
		
		case "Conversor De Watt hora para Megajoule": {
			escala.WattHoraToMegajoule(valor);				
			break;
			
		}
		case "Conversor De Watt hora para Caloria": {
			escala.WattHoraToCaloria(valor);				
			break;
	
		}
		case "Conversor De Watt hora para Metro Newton": {
			escala.WattHoraToMetroNewton(valor);				
			break;
		}

		case "Conversor De Watt hora para Libra do pé": {
			escala.WattHoraToLibradoPé(valor);				
			break;
		}
		
		case "Conversor De Watt hora para Quilowatt hora": {
			escala.WattHoraToQuilowattHora(valor);				
			break;
		}
		
		case "Conversor De Watt hora para Megawatt hora": {
			escala.WattHoraToMegawattHora(valor);				
			break;
		}
		
		case "Conversor De Watt hora para Mega elétron volt": {
			escala.WattHoraToMegaElétronVolt(valor);				
			break;
		}
		default:
			break;
		}
			ConversorGUI conversorGUI = new ConversorGUI();
			conversorGUI.continuar(3);
	}

}
