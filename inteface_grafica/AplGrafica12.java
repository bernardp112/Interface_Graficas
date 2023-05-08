package inteface_grafica;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AplGrafica12 {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Trabalhando com fontes");
		JPanel p = new JPanel();
		JButton b1 = new JButton("Botao 1");
		JButton b2 = new JButton("Botao 2");
		JButton b3 = new JButton("Botao 3");
		
		janela.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.setBackground(Color.ORANGE);
		
		b1.setBackground(Color.YELLOW);
		
		Font f = new Font("Arial", Font.ITALIC, 18);
		b1.setFont(f);
		b1.setForeground(Color.RED);
		
		Font f1 = new Font("Times New Roman", Font.PLAIN, 20);
		b2.setFont(f1);
		b2.setForeground(Color.blue);
		b3.setFont(f);
		
		janela.setVisible(true);
		janela.setBounds(50, 50, 500, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
