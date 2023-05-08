package inteface_grafica;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComboBoxAC extends JFrame implements ActionListener, ItemListener{
	
	private JPanel painelCombo;
	private JComboBox cbIdade;
	private JTextField txtCategoria, txtEsporte;
	private JLabel lblIdade, lblCategoria;
	private JCheckBox cbFutebol, cbNatacao, cbJudo;
	
	public ComboBoxAC (String str){
		
		String idades[] = {"Até 12 anos", "De 13 anos até 17 anos", "De 18 em diante"}; 
		
		painelCombo = new JPanel(new FlowLayout());
		add(painelCombo);
		
		cbIdade = new JComboBox(idades);
		txtCategoria = new JTextField(10);
		txtEsporte = new JTextField(10);
		cbFutebol = new JCheckBox("Futebol");
		cbNatacao = new JCheckBox("Natação");
		cbJudo = new JCheckBox("Judo");

	}

}
