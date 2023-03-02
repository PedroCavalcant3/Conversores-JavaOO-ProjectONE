package controlador;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logicaConversorEnergia.DialogoEnergia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import logicaConversorMoeda.ServicoDeConversao;
import logicaConversorTemperatura.DialogoTemperatura;

public class ConversorGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// instanciando objeto das classes referente aos dialogos de cada conversor
	ServicoDeConversao moeda = new ServicoDeConversao();
	DialogoTemperatura temperatura = new DialogoTemperatura();
	DialogoEnergia energia = new DialogoEnergia();

	public void continuar(int cod) {
		String[] opcoes = { "continuar", "sair", "menu" };

		int resposta = JOptionPane.showOptionDialog(null, "Deseja continuar?", "Conversor de Valores",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

		if (resposta == 0 && cod == 1) {
			moeda.dialogo(null);
		} else if (resposta == 0 && cod == 2) {
			temperatura.dialogo(null);
		} else if (resposta == 0 && cod == 3) {
			energia.dialogo(null);
		} else if (resposta == 2)
			return;
		else {
			JOptionPane.showMessageDialog(null, "Programa Concluído.");
			System.exit(0);
		}
	}

	/**
	 * Iniciando toda a aplicação.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorGUI frame = new ConversorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * codigo de criação da interface gui, utilizando 
	 * drag-in-drop, coneção com os comportametos
	 *vem dos eventos ActionListern em cada botão.
	 */
	public ConversorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pedro Cavalcante\\Desktop\\bgGuiConvert.png"));
		lblNewLabel.setBounds(0, 0, 600, 480);
		contentPane.add(lblNewLabel);

		// ao clicar no botão moeda, ativa o evento do click no botão iniciando
		// conversão

		JButton btnMoeda = new JButton("");
		btnMoeda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				moeda.dialogo(e);
			}

		});

		btnMoeda.setIcon(new ImageIcon(
				"C:\\Users\\Pedro Cavalcante\\One-Convert\\ConversorMoedaTemperaturaEnergia\\ConvertGuiImg\\coin.png"));
		btnMoeda.setBounds(31, 328, 70, 64);
		btnMoeda.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Moeda",
				javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
		contentPane.add(btnMoeda);

		// ao clicar no botão temperatura, ativa o evento do click no botão iniciando
		// conversão
		JButton btnTemperatura = new JButton("");
		btnTemperatura.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				temperatura.dialogo(e);

			}
		});

		btnTemperatura.setIcon(new ImageIcon(
				"C:\\Users\\Pedro Cavalcante\\One-Convert\\ConversorMoedaTemperaturaEnergia\\ConvertGuiImg\\power-penal.png"));
		btnTemperatura.setBounds(105, 328, 70, 64);
		btnTemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Temperatura",
				javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
		contentPane.add(btnTemperatura);

		JButton btnEnergia = new JButton("");
		btnEnergia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				energia.dialogo(e);
			}
		});
		btnEnergia.setIcon(new ImageIcon(
				"C:\\Users\\Pedro Cavalcante\\One-Convert\\ConversorMoedaTemperaturaEnergia\\ConvertGuiImg\\temperature.png"));
		btnEnergia.setBounds(185, 328, 70, 64);
		btnEnergia.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Energia",
				javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
		contentPane.add(btnEnergia);

	}

}
