package inteface_grafica;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AplGrafica13 {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Teste com JTextArea e JScrollPane");
		
		janela.setLayout(new BorderLayout());
		
		JPanel painel1 = new JPanel(new FlowLayout());
		JPanel painel2 = new JPanel(new FlowLayout());

		JTextArea area1 = new JTextArea(20, 20);
		JTextArea area2 = new JTextArea("AREA 2", 20, 20);
		
		JScrollPane br = new JScrollPane(area1);
		
		janela.add(painel1, BorderLayout.WEST);
		painel1.setBackground(Color.GREEN);
		painel1.add(br);
		
		janela.add(painel2, BorderLayout.CENTER);
		painel2.setBackground(Color.BLACK);
		painel2.add(area2);
		
		area1.setForeground(Color.RED);
		area2.setForeground(Color.BLUE);
		//area1.setFont(new Font("Arial", Font.BOLD, 20));
		area1.setText("Aula de POO");
		area2.append(" " + area1.getText() + " Testando");
		
		janela.setVisible(true);
		janela.pack();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
