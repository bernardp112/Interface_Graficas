package inteface_grafica;

import java.awt.GridLayout; 
import javax.swing.*;

public class AplGrafica07 extends JFrame{
	
	private JButton botao1, botao2, botao3, botao4;
	private JLabel label1, label2;
	
	public AplGrafica07() {
		
		super("Interface Gráfica com Swing - versão 07");
		
	}
	
	public void Executa() {
		
		botao1 = new JButton("Botão 1");
		botao2 = new JButton("Botão 2");
		botao3 = new JButton("Botão 3");
		botao4 = new JButton("Botão 4");
		
		label1 = new JLabel("Grupo Botões 1");
		label2 = new JLabel("Grupo Botões 2");
		
		setSize(600, 400);
		setLocation(500, 300);
		
		getContentPane().setLayout(new GridLayout(2, 3));
		getContentPane().add(label1);
		getContentPane().add(botao1);
		getContentPane().add(botao2);
		getContentPane().add(label2);
		getContentPane().add(botao3);
		getContentPane().add(botao4);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		
		new AplGrafica07().Executa();
		
	}

}
