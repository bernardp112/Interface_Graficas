package inteface_grafica;

import javax.swing.*; 
import java.awt.*;

public class AplGrafica05 {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		JPanel painel = new JPanel();
		
		janela.add(painel);
		
		painel.setLayout(new GridLayout(2, 3));
		painel.add(new JButton("Botão 1"));
		painel.add(new JTextField("TEXTO 1"));
		painel.add(new JButton("Botão 2"));
		painel.add(new JTextField("TEXTO 2"));
		painel.add(new JButton("Botão 3"));

		janela.pack();
		janela.setLocation(500, 300);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} 

}
