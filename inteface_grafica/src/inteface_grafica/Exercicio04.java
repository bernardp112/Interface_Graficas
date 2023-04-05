package inteface_grafica;

import javax.swing.*;

public class Exercicio04 {

	public static void main(String args[]) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton botao1 = new JButton("Converter >>> ");
		JLabel label = new JLabel("Temperatura em Celsiuls: ");
		JLabel label2 = new JLabel("Temperatura em Fahrenheit: ");
		JTextField textfield = new JTextField("                         ");
		JTextField textfield2 = new JTextField("                          ");

		frame.setSize(700,150);
		frame.setLocation(700,300);
		frame.setResizable(false);
		frame.add(panel);
		panel.add(label);
		panel.add(textfield);
		panel.add(botao1);
		panel.add(label2);
		panel.add(textfield2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}