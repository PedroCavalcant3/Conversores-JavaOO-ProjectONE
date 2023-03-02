package logicaConversorMoeda;

import java.awt.event.ActionEvent;
import controlador.ConversorGUI;

import javax.swing.JOptionPane;


public class ServicoDeConversao  {
	
	public  void dialogo(ActionEvent e) {
		String tipoConversao;
		String input;
		String[] siglas = { "USD-BRL", "EUR-BRL", "GBP-BRL", "ARS-BRL", "CLP-BRL", "BRL-USD", "BRL-EUR", "BRL-GBP",
				"BRL-ARS", "BRL-CLP" };
		
		
		

		String[] opcoesConversao = { "Converter de Reais a Dólar", "Converter de Reais a Euros",
				"Converter de Reais a Libras Esterlinas", "Converter de Reais a Peso argentino",
				"Converter de Reais a Peso Chileno", "Converter de Dólar a Reais", "Converter de Euro a Reais",
				"Converter de Libras Esterlinas a Reais", "Converter de Peso argentino a  Reais",
				"Converter de Peso Chileno a Reais" };
		tipoConversao = (String) JOptionPane.showInputDialog(null,
				"Escolha a moeda para qual você deseja converter o seu dinheiro:", "Seleção de Moedas",
				JOptionPane.PLAIN_MESSAGE, null, opcoesConversao, "0");
		if (tipoConversao == null)
			return;

		String message = ("Digite a Quatia a que deseja converter " + tipoConversao);
		input = JOptionPane.showInputDialog(message);
		
		if (input == null)
			return;
		
		double valor = Double.valueOf(input).doubleValue();
		switch (tipoConversao) {

		case "Converter de Reais a Dólar": {

			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[0]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em tantos dinheiros: " + resultado + " Dólares");

				break;
			} catch (Exception e1) {
			}
		}

		case "Converter de Reais a Euros": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[1]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Euros");
				break;
			} catch (Exception e1) {
			}
		}
		case "Converter de Reais a Libras Esterlinas": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[2]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Libras Esterlinas");
				break;
			} catch (Exception e1) {
			}
		}
		case "Converter de Reais a Peso argentino": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[3]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Peso argentino");
				break;
			} catch (Exception e1) {
			}
		}
		case "Converter de Reais a Peso Chileno": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[4]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Peso Chileno");
				break;
			} catch (Exception e1) {
			}
		}

		case "Converter de Dólar a Reais": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[5]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Reais");
				break;
			} catch (Exception e1) {
			}
		}
		case "Converter de Euro a Reais": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[6]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Reais");
				break;
			} catch (Exception e1) {
			}
		}
		case "Converter de Libras Esterlinas a Reais": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[7]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Reais");
				break;
			} catch (Exception e1) {
			}
		}
		case "Converter de Peso argentino a  Reais": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[8]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Reais");
				break;
			} catch (Exception e1) {
			}
		}
		case "Converter de Peso Chileno a Reais": {
			CotacaoDeMoedas cotacaoDeMoedas;
			try {
				cotacaoDeMoedas = ServicoDeCotacao.buscaMoedaPela(siglas[9]);
				String name = cotacaoDeMoedas.getName();
				double bid = cotacaoDeMoedas.getBid();
				double resultado = ServicoDeConversao.converter(valor, bid);

				JOptionPane.showMessageDialog(null,
						"Conversão " + name + " resulta em: " + resultado + " Reais");
				break;
			} catch (Exception e1) {
			}
		}

		default:
			break;
		}
		ConversorGUI conversorGUI = new ConversorGUI();
		conversorGUI.continuar(1);
	}
	
	
	//Método unico com função de converter quaisquer moeda desejada
	public static double converter(double value, double moeda) {
		
		double valorMoeda = value / moeda; 
		 return valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
	}
	
}
	