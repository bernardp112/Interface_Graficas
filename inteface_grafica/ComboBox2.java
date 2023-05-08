package inteface_grafica;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ComboBox2 extends JFrame{

	private JComboBox comboElem;
	private JPanel p;
	private JLabel rotulo;
	
	private String nomes[] = {"Tei", "Ping", "Pong", "Chiriro"};
	
	public ComboBox2() {
		
		super("Testando o combo");
		
		p = new JPanel();
		add(p);
		p.setLayout(new FlowLayout());
		
		comboElem = new JComboBox(nomes);
		comboElem.setMaximumRowCount(3);
		
		p.add(comboElem);
		
		rotulo = new JLabel("Item do combo");
		p.add(rotulo);
		
		Ouvinte ouvinte = new Ouvinte();
		comboElem.addItemListener(ouvinte);
		
	}
	
	private class Ouvinte implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getStateChange() == ItemEvent.SELECTED)
				rotulo.setText(nomes[comboElem.getSelectedIndex()]);
			
		}
		
	}
	
}
