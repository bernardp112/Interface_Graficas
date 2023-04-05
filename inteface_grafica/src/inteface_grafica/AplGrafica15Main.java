package inteface_grafica;

import javax.swing.JFrame;

public class AplGrafica15Main {
	
	public static void main(String[] args) {
		
		AplGrafica15 radioButton = new AplGrafica15("Trabalhando com botões de opções");
		
		radioButton.setVisible(true);
		radioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radioButton.pack();
		
	}

}
