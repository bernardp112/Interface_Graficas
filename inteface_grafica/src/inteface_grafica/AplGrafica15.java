package inteface_grafica;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AplGrafica15 extends JFrame{
	
	private JTextField campoTexto;
	private JRadioButton rbNormal;
	private JRadioButton rbNegrito;
	private JRadioButton rbItalico;
	private JRadioButton rbNegritoItalico;
	private ButtonGroup radioGrupo;
	private Font normal;
	private Font negrito;
	private Font italico;
	private Font negIta;
	
	public AplGrafica15(String titulo) {
		
		super(titulo);
		setLayout(new FlowLayout());
		
		campoTexto = new JTextField("Veja o estilo da fonte", 25);
		add(campoTexto);
		
		rbNormal = new JRadioButton("Normal");
		rbNegrito = new JRadioButton("Negrito");
		rbItalico = new JRadioButton("Italico");
		rbNegritoItalico = new JRadioButton("Negrito/Italico");
		
		add(rbNormal);
		add(rbNegrito);
		add(rbItalico);
		add(rbNegritoItalico);
		
		radioGrupo = new ButtonGroup();
		radioGrupo.add(rbNormal);
		radioGrupo.add(rbNegrito);
		radioGrupo.add(rbItalico);
		radioGrupo.add(rbNegritoItalico);
		
		normal = new Font("Arial", Font.PLAIN, 14);
		italico = new Font("Arial", Font.ITALIC, 14);
		negrito = new Font("Arial", Font.BOLD, 14);
		negIta = new Font("Arial", Font.ITALIC + Font.BOLD, 14);
		
		campoTexto.setFont(normal);
		
	}

}
