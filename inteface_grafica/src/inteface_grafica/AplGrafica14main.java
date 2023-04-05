package inteface_grafica;

import javax.swing.JFrame;

public class AplGrafica14main {

	public static void main(String[] args) {
		
		AplGrafica14 senha = new AplGrafica14("Testando JPasswordField");
		senha.setVisible(true);
		senha.setBounds(10, 10, 200, 120);
		senha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
