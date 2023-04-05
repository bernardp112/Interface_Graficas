package inteface_grafica;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AplGrafica09 {
	
	public static void main(String[] args) {
		
		JButton botao1, botao2;
		JLabel label1, label2, label3;
		
		JFrame janela = new JFrame("Interface Gráfica com Swing - versão 09");
		
		botao1 = new JButton("Botão direito");
		botao2 = new JButton("Botão esquerdo");
		
		label1 = new JLabel("Área superior", JLabel.CENTER);
		label2 = new JLabel("Área inferior", JLabel.CENTER);
		label3 = new JLabel("Área central", JLabel.CENTER);
		
		janela.setSize(600, 400);
		janela.setLocation(500, 300);
		janela.setLayout(new BorderLayout());
		
		janela.add(label1, BorderLayout.NORTH);
		janela.add(botao1, BorderLayout.EAST);
		janela.add(label2, BorderLayout.SOUTH);
		janela.add(botao2, BorderLayout.WEST);
		janela.add(label3, BorderLayout.CENTER);
		
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
