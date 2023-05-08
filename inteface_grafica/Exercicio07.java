package inteface_grafica;

import java.awt.Container;
import java.awt.GridLayout; 
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.*;

public class Exercicio07 extends JFrame{
	
	static void criaBotaoDigito(Container c, int i) {
		
		c.add(new JButton(Integer.toString(i)));
		
	}

	public static void main(String[] args) {
	
		JFrame f = new JFrame(("Calculadora"));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JTextField entrada = new JTextField(10);
		Container c = f.getContentPane();
		
		p1.add(entrada, new FlowLayout());
		p2.setLayout(new GridLayout(4, 3));
		p3.setLayout(new GridLayout(4, 1));
		
		p3.add(new JButton("*"));
		p3.add(new JButton("/"));
		p3.add(new JButton("+"));
		p3.add(new JButton("-"));
		
		for (int i = 9; i >= 0; i--) {
			
			criaBotaoDigito(p2, i);
			
		}
		
		p2.add(new JButton("="));
		c.setLayout(new BorderLayout());
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.WEST);
		c.add(p3, BorderLayout.EAST);
		
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
