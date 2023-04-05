package exercicio;

import java.awt.*; 
import javax.swing.*;

public class Frame_Grid {
	
	public static void main(String[] args) {
	
		JFrame janela = new JFrame();
		JPanel painel = new JPanel();
		
		JTextField txtNumero = new JTextField(10);
		JTextField txtMaior = new JTextField(10);
		JTextField txtMenor = new JTextField(10);
		JTextField txtMedia = new JTextField(10);
		JTextField txtValores = new JTextField(10);

		JLabel lblNumero = new JLabel("Digite o numero: ");
		JLabel lblMaior = new JLabel("Maior >>> ", JLabel.CENTER);
		JLabel lblMenor = new JLabel("Menor >>> ", JLabel.CENTER);
		JLabel lblMedia = new JLabel("Média >>> ", JLabel.CENTER);
		JLabel lblValores = new JLabel("    Valores: ");

		
		JButton btnOk = new JButton("OK");
		JButton btnExibir = new JButton("Exibir");
	    JButton btnCalcular = new JButton("Calcular");
	    JButton btnExtra = new JButton("Extra");
		
		janela.add(painel);
		painel.setLayout(new GridLayout(10, 3));
		
		painel.add(lblNumero);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(txtNumero);
		painel.add(btnOk);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(lblMaior);
		painel.add(txtMaior);
		painel.add(new JLabel(""));
		painel.add(lblMenor);
		painel.add(txtMenor);
		painel.add(btnExibir);
		painel.add(lblMedia);
		painel.add(txtMedia);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(lblValores);
		painel.add(txtValores);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(btnExtra);
		painel.add(btnCalcular);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		
		janela.setLocation(500, 300);
		janela.pack();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
