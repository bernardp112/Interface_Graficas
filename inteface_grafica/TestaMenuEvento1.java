package inteface_grafica;

import javax.swing.JFrame;

public class TestaMenuEvento1 {
	
	public static void main(String args[]) {
		
		MenuEvento1 janela = new MenuEvento1("Usando menus.");
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
