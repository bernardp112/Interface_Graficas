package inteface_grafica;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class AplGrafica14 extends JFrame{
	
	private JPanel painel;
	private JPasswordField senha;
	private JLabel rotuloSenha;
	
	public AplGrafica14(String titulo) {
		
		super(titulo);
		
		painel = new JPanel(new FlowLayout());
		painel.setBackground(Color.BLUE);
		
		senha = new JPasswordField(5);
		
		rotuloSenha = new JLabel("SENHA");
		
		add(painel);
		painel.add(rotuloSenha);
		painel.add(senha);
		
		//String pass = new String(senha.getPassword());
		//senha.setEchoChar('@');
		
		JOptionPane.showMessageDialog(null, "Observe ... Vai ecoar o caracter " + senha.getEchoChar());
		
	}

}
