package inteface_grafica;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AplGrafica11 {

	public static void main(String args[ ]) {

		JFrame janela = new JFrame("Teste");
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new BorderLayout());

		p1.add(new JButton("B1 - painel 1"));
		p1.add(new JButton("B2 - painel 1"));
		p1.setBackground(Color.BLUE); 
		p2.add(new JButton("B1 - painel 2"), BorderLayout.WEST);
		p2.add(new JButton("B2 - painel 2"), BorderLayout.EAST);
		p2.setBackground(Color.YELLOW);

		janela.add(p1, BorderLayout.NORTH);
		janela.add(new JButton("Botão central"),BorderLayout.CENTER);
		janela.add(p2,BorderLayout.SOUTH);
		janela.setVisible(true);
		janela.setSize(300,300);
		janela.setLocation(200,200);

	}
	
}