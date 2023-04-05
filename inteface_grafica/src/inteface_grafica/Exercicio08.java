package inteface_grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.util.Date;

public class Exercicio08 {

	public static void main(String args[ ]) {

		JFrame janela = new JFrame("Usando janela com area de texto");
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		JTextArea areaTexto = new JTextArea("Digite seu texto aqui: ", 20, 50);
		JLabel relogio = new JLabel("Data/Hora: " + new Date().toString());
		JLabel mensagem = new JLabel("Mensagem: ");
		
		p1.add(new JButton("Novo"));
		p1.add(new JButton("Limpar"));
		p1.add(new JButton("Salvar"));
		p1.add(new JButton("Sair"));
		
		p2.add(mensagem);
		p2.add(relogio);

		areaTexto.setBackground(Color.YELLOW);

		janela.add(p1, BorderLayout.NORTH);
		janela.add(p2,BorderLayout.SOUTH);
		janela.add(areaTexto, BorderLayout.CENTER);
		janela.setVisible(true);
		janela.setSize(500, 500);
		janela.setLocation(200,130);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	} 
	
} 