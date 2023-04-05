package inteface_grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercicio09_1 {
	
	public static void main(String[] args) {

	JFrame janela = new JFrame("Usando janela com area de texto");
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel(new BorderLayout());
	JPanel p3 = new JPanel();
	JPanel p21 = new JPanel();
	JPanel p22 = new JPanel();
	JPanel p23 = new JPanel(new BorderLayout());
	JPanel p231 = new JPanel();
	JPanel p232 = new JPanel();
	
	JTextArea areaTexto = new JTextArea("Digite seu texto aqui: ", 30, 60);
	
	JTextField txtNome = new JTextField(7);
	JTextField txtSobrenome = new JTextField(15);
	JTextField txtTelefone = new JTextField(20);
	JTextField txtEmail = new JTextField(15);
	
	JLabel email = new JLabel("E-mail: ");
	JLabel nome = new JLabel("Nome: ");
	JLabel sobrenome = new JLabel("Sobrenome: ");
	JLabel telefone = new JLabel("Telefone: ");
	JLabel layout = new JLabel("Estudando layouts compostos");
	JLabel relogio = new JLabel("Data/Hora: " + new Date().toString());

	p1.add(nome);
	p1.add(txtNome);
	p1.add(sobrenome);
	p1.add(txtSobrenome);
	p1.setBackground(Color.YELLOW);
	
	p2.add(p21, BorderLayout.NORTH);
	p2.add(p22, BorderLayout.WEST);
	p2.add(p23, BorderLayout.CENTER);
	p2.setBackground(Color.CYAN);
	
	p21.add(telefone);
	p21.add(txtTelefone);
	p21.add(email);
	p21.add(txtEmail);
	p21.setBackground(Color.GREEN);
	
	p22.add(layout);
	p22.setBackground(Color.ORANGE);
	
	p23.add(p231, BorderLayout.NORTH);
	p23.add(p232, BorderLayout.SOUTH);
	p23.setBackground(Color.BLUE);
		
	p231.add(relogio);
	p231.setBackground(Color.PINK);
	
	p232.add(areaTexto);
	p232.setBackground(Color.LIGHT_GRAY);
   
	p3.add(new JButton("Inserir"));
	p3.add(new JButton("Remover"));
	p3.add(new JButton("Sair"));
	p3.setBackground(Color.RED);
	
	janela.add(p1, BorderLayout.NORTH);
	janela.add(p2,BorderLayout.CENTER);
	janela.add(p3, BorderLayout.SOUTH);
	janela.setVisible(true);
	janela.pack();
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    } 

}