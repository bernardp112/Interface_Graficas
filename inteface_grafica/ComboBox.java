package inteface_grafica;

import java.awt.BorderLayout; 
//import java.awt.ItemSelectable; 
import java.awt.event.ItemEvent; 
import java.awt.event.ItemListener; 
import javax.swing.JComboBox; 
import javax.swing.JFrame; 

public class ComboBox implements ItemListener { 
	
	public static void main(String args[ ]) { 
		
		String labels[ ] = { "A", "B", "C", "D", "E", "F" }; 
		JFrame frame = new JFrame("Selecting JComboBox"); 
		JComboBox comboBox = new JComboBox(labels); 
		frame.add(comboBox, BorderLayout.SOUTH);
		comboBox.addItemListener(new ComboBox()); 
		frame.setSize(400, 200); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void itemStateChanged(ItemEvent itemEvent) { 
		Object i = itemEvent.getItem(); 
		int state = itemEvent.getStateChange(); 
		System.out.println((state == ItemEvent.SELECTED) ? "Selected " + i : "Deselected " + i);
		System.out.println("Item afetado pelo evento : " + i); 
		
	}
	
}