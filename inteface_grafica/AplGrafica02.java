package inteface_grafica;

import javax.swing.JFrame;

public class AplGrafica02 extends JFrame {
	
	public AplGrafica02() {
	
		super("Interface Gráfica com Swing - versão 02");
		
	}
	
	public void Executa() {
		
		setSize(320, 200);
		setLocation(500,300);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		
		new AplGrafica02().Executa();
		
	}

}
