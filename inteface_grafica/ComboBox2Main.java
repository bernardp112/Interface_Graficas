package inteface_grafica;

import javax.swing.JFrame;

public class ComboBox2Main {

	public static void main(String[] args) {
		
		ComboBox2 cb = new ComboBox2();
		
		cb.setSize(250, 100);
		cb.setLocation(300, 300);
		cb.setVisible(true);
		cb.setResizable(false);	
		cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
