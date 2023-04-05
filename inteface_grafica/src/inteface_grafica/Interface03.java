package inteface_grafica;

import javax.swing.JOptionPane;

public class Interface03 {

	public static void main(String args[]){
		
		String nome;
		int resposta;
		
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
		
		if (resposta == JOptionPane.YES_OPTION) {
			
			JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);
		
		}
			
	}
	
}
