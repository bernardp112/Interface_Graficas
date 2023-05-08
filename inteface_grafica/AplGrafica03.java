package inteface_grafica;

import java.awt.FlowLayout;
import javax.swing.*;

public class AplGrafica03 {
	
	public static void main(String args[]) {
		
		JButton botao1, botao2, botao3, botao4;
		JLabel label1, label2;
		
		JFrame janela = new JFrame("Interface Gráfica com Swing - versão 03");
		
		botao1 = new JButton("Botão 1");
		botao2 = new JButton("Botão 2");
		botao3 = new JButton("Botão 3");
		botao4 = new JButton("Botão 4");
		
		label1 = new JLabel("Grupo Botões 1");
		label2 = new JLabel("Grupo Botões 2");
		
		janela.setSize(600,400);
		janela.setLocation(500,300);
		
		janela.getContentPane().setLayout(new FlowLayout());
		
		janela.getContentPane().add(label1);
		janela.getContentPane().add(botao1);
		janela.getContentPane().add(botao2);
		janela.getContentPane().add(label2);
		janela.getContentPane().add(botao3);
		janela.getContentPane().add(botao4);
		
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
