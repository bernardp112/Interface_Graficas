package inteface_grafica;

import javax.swing.*;
import java.awt.*;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		
		janela.setLayout(new BorderLayout());
		janela.add(new JButton("Cancelar"),BorderLayout.NORTH);
		janela.add(new JButton("Sim"),BorderLayout.EAST);
		janela.add(new JLabel("Mensagem:"), BorderLayout.WEST);
		janela.add(new JButton("Não"), BorderLayout.SOUTH);
		
		janela.setSize(250, 250);
		janela.setLocation(500, 300);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

}
