package inteface_grafica;

import java.awt.BorderLayout;
import javax.swing.*;

public class AplGrafica10 extends JFrame{
	
	private JButton botao1, botao2;
	private JLabel label1, label2, label3;
	
	public AplGrafica10() {
		
		super("Interface Gráfica com Swing - versão 10");
		
	}
	
	public void Executa() {
		
		botao1 = new JButton("Botão direito");
		botao2 = new JButton("Botão esquerdo");
		
		label1 = new JLabel("Área superior", JLabel.CENTER);
		label2 = new JLabel("Área inferior", JLabel.CENTER);
		label3 = new JLabel("Área central", JLabel.CENTER);

		setSize(600, 400);
		setLocation(500, 300);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(label1, BorderLayout.NORTH);
		getContentPane().add(botao1, BorderLayout.EAST);
		getContentPane().add(label2, BorderLayout.SOUTH);
		getContentPane().add(botao2, BorderLayout.WEST);
		getContentPane().add(label3, BorderLayout.CENTER);
		
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		
		new AplGrafica10().Executa();
		
	}

}
