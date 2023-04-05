package exercicio;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame {
	
	public static void main(String[] args) {

	JFrame janela = new JFrame("Programa Frame - V2 LP5");
	
	JPanel p1 = new JPanel(new BorderLayout());
	JPanel p2 = new JPanel(new BorderLayout());
	JPanel p3 = new JPanel(new BorderLayout());
	JPanel p11 = new JPanel(new BorderLayout());
	JPanel p12 = new JPanel();
	JPanel p111 = new JPanel();
	JPanel p112 = new JPanel();
	JPanel p21 = new JPanel(new BorderLayout());
	JPanel p22 = new JPanel(new BorderLayout());
	JPanel p23 = new JPanel();
	JPanel p211 = new JPanel();
	JPanel p212 = new JPanel();
	JPanel p213 = new JPanel();
	JPanel p221 = new JPanel();
	JPanel p222 = new JPanel();
	JPanel p223 = new JPanel();
	JPanel p31 = new JPanel();
	JPanel p32 = new JPanel(new BorderLayout());
	JPanel p33 = new JPanel();
	JPanel p321 = new JPanel();
    JPanel p322 = new JPanel();
	
	JTextField txtNumero = new JTextField(10);
	JTextField txtMaior = new JTextField(10);
	JTextField txtMenor = new JTextField(10);
	JTextField txtMedia = new JTextField(10);
	JTextField txtValores = new JTextField(10);

	JLabel numero = new JLabel("Digite o numero: ");
	JLabel maior = new JLabel("Maior >>> ");
	JLabel menor = new JLabel("Menor >>> ");
	JLabel media = new JLabel("Média >>> ");
	JLabel valores = new JLabel("Valores: ");

	p1.add(p11, BorderLayout.WEST);
	p1.add(p12, BorderLayout.CENTER);
	
	p11.add(p111, BorderLayout.NORTH);
    p11.add(p112, BorderLayout.CENTER);
    
    p12.add(new JButton("OK"));
    
    p111.add(numero);
    p112.add(txtNumero);
    
	p2.add(p21, BorderLayout.WEST);
	p2.add(p22, BorderLayout.CENTER);
	p2.add(p23, BorderLayout.EAST);
	
	p21.add(p211, BorderLayout.NORTH);
	p21.add(p212, BorderLayout.CENTER);
	p21.add(p213, BorderLayout.SOUTH);
	
	p22.add(p221, BorderLayout.NORTH);
	p22.add(p222, BorderLayout.CENTER);
	p22.add(p223, BorderLayout.SOUTH);
	
	p23.add(new JButton("Exibir"));
	
	p211.add(maior);
	p212.add(menor);
	p213.add(media);
	
	p221.add(txtMaior);
	p222.add(txtMenor);
	p223.add(txtMedia);
	
	p3.add(p31, BorderLayout.WEST);
	p3.add(p32, BorderLayout.CENTER);
	p3.add(p33, BorderLayout.EAST);
	
	p31.add(valores);
	
	p32.add(p321,BorderLayout.NORTH);
	p32.add(p322,BorderLayout.CENTER);
	
	p33.add(new JButton("Calcular"));

	janela.add(p1, BorderLayout.NORTH);
	janela.add(p2,BorderLayout.CENTER);
	janela.add(p3, BorderLayout.SOUTH);
	janela.setVisible(true);
	janela.pack();
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    } 

}