package inteface_grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		JPanel p1, p2, p3, p21, p22, p23, p231, p232;
		JTextField txtNome, txtSobrenome, txtTelefone, txtEmail;
		JButton btnInserir, btnRemover, btnSair;
		JLabel lblNome, lblSobrenome, lblTelefone, lblEmail, lblMensagem;
		JTextArea texto;
		
		Font f;
		f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
		
		txtNome = new JTextField(7);
		txtSobrenome = new JTextField(15);
		txtTelefone = new JTextField(20);
		txtEmail = new JTextField(15);
		
		lblNome = new JLabel("Nome: ");
		lblSobrenome = new JLabel("Sobrenome: ");
		lblTelefone = new JLabel("Telefone: ");
		lblEmail = new JLabel("E-mail: ");
		lblMensagem = new JLabel("Estudando layouts compostos");
		
		lblMensagem.setForeground(Color.GREEN);
		lblMensagem.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 12));
		
		texto = new JTextArea(3, 30);
		texto.setFont(f);
		texto.setForeground(Color.RED);
		
		Border bordaTexto = new LineBorder(Color.MAGENTA, 4);
		texto.setBorder(bordaTexto);
		
		Cursor mao = new Cursor(Cursor.HAND_CURSOR);
		//Cursor mao = new Cursor(Cursor.TEXT_CURSOR);
		//Cursor mao = new Cursor(Cursor.CROSSHAIR_CURSOR);
		//Cursor mao = new Cursor(Cursor.WAIT_CURSOR);
		//Cursor mao = new Cursor(Cursor.MOVE_CURSOR);
		//Cursor mao = new Cursor(Cursor.DEFAULT_CURSOR);
		texto.setCursor(mao);
		
		texto.setToolTipText("Testando a dica...");
		
		btnInserir = new JButton("Inserir");
		btnRemover = new JButton("Remover");
		btnSair = new JButton("Sair");
		
		btnSair.setFont(f);
		btnSair.setForeground(Color.RED);
		
		btnRemover.setBorder(new LineBorder(Color.BLUE, 2));
		
		p1 = new JPanel();
		p2 = new JPanel(new BorderLayout());
		p3 = new JPanel();
		
		p21 = new JPanel();
		p22 = new JPanel();
		p23 = new JPanel(new BorderLayout());
		
		p231 = new JPanel();
		p232 = new JPanel();
		
		p1.setBackground(Color.YELLOW);
		p2.setBackground(Color.CYAN);
		p3.setBackground(Color.red);
		
		p21.setBackground(Color.GREEN);
		p22.setBackground(Color.ORANGE);
		p23.setBackground(Color.blue); //nao aparece!!!
		
		p231.setBackground(Color.PINK);
		p232.setBackground(Color.LIGHT_GRAY);
		
		janela.add(p1, BorderLayout.NORTH);
		janela.add(p2, BorderLayout.CENTER);
		janela.add(p3, BorderLayout.SOUTH);

		p2.add(p21, BorderLayout.NORTH);
		p2.add(p22, BorderLayout.WEST);
		p2.add(p23, BorderLayout.CENTER);
		
		p23.add(p231, BorderLayout.NORTH);
		p23.add(p232, BorderLayout.CENTER);
		
		p1.add(lblNome);
		p1.add(txtNome);

		p1.add(lblSobrenome);
		p1.add(txtSobrenome);

		p21.add(lblTelefone);
		p21.add(txtTelefone);

		p21.add(lblEmail);
		p21.add(txtEmail);

		p22.add(lblMensagem);
		
		p231.add(new JLabel("Data/hora: " + new Date()));
		
		p232.add(texto);
		
		p3.add(btnInserir);
		p3.add(btnRemover);
		p3.add(btnSair);
		
		janela.setVisible(true);
		janela.pack();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
