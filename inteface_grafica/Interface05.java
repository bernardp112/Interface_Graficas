package inteface_grafica;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Interface05{
	
	public static void main(String args[]) {
		
		String sPeso, sAltura, imcFinal;
		double peso = 0, altura, imc;
		DecimalFormat df = new DecimalFormat("0.00");
		
		try {
			
			sPeso = JOptionPane.showInputDialog("Digite seu peso: ");
			peso = Double.parseDouble(sPeso);
			
			sAltura = JOptionPane.showInputDialog("Digite sua altura: ");
			altura = Double.parseDouble(sAltura);
			
		} catch (NumberFormatException erro) {
			
			JOptionPane.showMessageDialog(null, "Altura inválida ! Digite com ponto decimal! ");
			sAltura = JOptionPane.showInputDialog("Digite sua altura: ");
			altura = Double.parseDouble(sAltura);
			
		}
		
		imc = peso / Math.pow(altura, 2);
		imcFinal = df.format(imc);
		
		JOptionPane.showMessageDialog(null, "IMC = " + imcFinal, "Calculando IMC", JOptionPane.INFORMATION_MESSAGE);
		
		if (imc < 18.5) {
			
			JOptionPane.showMessageDialog(null, "Abaixo do peso.");
			
		}
		
		else 
			
			if (imc < 25) {
				
				JOptionPane.showMessageDialog(null, "Peso normal.");
				
			}
		
			else
				
				JOptionPane.showMessageDialog(null, "Acima do peso.");
		
		System.exit(0);
		
	}
	
}