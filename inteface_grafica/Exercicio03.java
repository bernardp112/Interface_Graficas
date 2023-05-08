package inteface_grafica;

import javax.swing.*;

public class Exercicio03 {

	public static void main(String args[]) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton botao1 = new JButton("Meu nome");
		JButton botao2 = new JButton("Meu sobrenome");
		JLabel label = new JLabel("Interface Gráfica");
		JTextField textfield = new JTextField("Digite aqui");
		
		frame.setSize(400,200);
		frame.setLocation(700,300);
		frame.setResizable(false);
		frame.add(panel);
		panel.add(label);
		panel.add(botao1);
		panel.add(botao2);
		panel.add(textfield);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
