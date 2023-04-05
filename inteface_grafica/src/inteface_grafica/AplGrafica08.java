package inteface_grafica;

import javax.swing.*;
import java.awt.*;

public class AplGrafica08 {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		
		janela.setLayout(new BorderLayout());
		janela.add(new JButton("Botão 1"),BorderLayout.NORTH);
		janela.add(new JTextField("TEXTO 2"),BorderLayout.EAST);
		janela.add(new JTextField("TEXTO 1"), BorderLayout.WEST);
		janela.add(new JButton("Botão 2"), BorderLayout.CENTER);
		janela.add(new JButton("Botão 3"), BorderLayout.SOUTH);
		janela.setSize(300, 400);
		janela.setLocation(600, 250);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

}
