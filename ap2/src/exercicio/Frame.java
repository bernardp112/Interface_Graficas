package exercicio;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ItemEvent;

public class Frame_Grid extends JFrame implements ActionListener{
	
	private JTextField txtNumero, txtMaior, txtMenor, txtMedia, txtValores;
	private JLabel lblNumero, lblMaior, lblMenor, lblMedia, lblValores, lblResultado;
	private JButton btnOk, btnExibir, btnCalcular;
	int i = 0;	    
    ArrayList<Double> vetor = new ArrayList<>();

	public Frame_Grid() {
		
		String[] labels = {"Somar", "Multiplicar"};

		JFrame janela = new JFrame();
		JPanel painel = new JPanel();
		JComboBox comboBox = new JComboBox(labels);
		
		txtNumero = new JTextField(10);
		txtMaior = new JTextField(10);
		txtMenor = new JTextField(10);
		txtMedia = new JTextField(10);
		txtValores = new JTextField(10);

		lblNumero = new JLabel("Digite o numero: ");
		lblMaior = new JLabel("Maior >>> ", JLabel.CENTER);
		lblMenor = new JLabel("Menor >>> ", JLabel.CENTER);
		lblMedia = new JLabel("Média >>> ", JLabel.CENTER);
		lblValores = new JLabel("    Valores: ");
		lblResultado = new JLabel("");
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(this);
	    btnCalcular = new JButton("Calcular");
	    btnCalcular.addActionListener(this);
		
		janela.add(painel);
		painel.setLayout(new GridLayout(10, 3));
		
		painel.add(lblNumero);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(txtNumero);
		painel.add(btnOk);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(lblMaior);
		painel.add(txtMaior);
		painel.add(new JLabel(""));
		painel.add(lblMenor);
		painel.add(txtMenor);
		painel.add(btnExibir);
		painel.add(lblMedia);
		painel.add(txtMedia);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		painel.add(lblValores);
		painel.add(txtValores);
		painel.add(lblResultado);
		painel.add(new JLabel(""));
		painel.add(comboBox);
		painel.add(btnCalcular);
		painel.add(new JLabel(""));
		painel.add(new JLabel(""));
		
		janela.setLocation(500, 300);
		janela.pack();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
    public void actionPerformed(ActionEvent event) {
            		

    	if(event.getSource() == btnOk) {
            
    		double numero = Double.parseDouble(txtNumero.getText());

    		vetor.add(numero);
    		
    	}
    	
    	else if(event.getSource() == btnExibir) {

    		double max = vetor.get(0);
            for (int i = 1; i < vetor.size(); i++) {
                if (max < vetor.get(i))
                    max = vetor.get(i);
            }
            
            double min = vetor.get(0);
            for (int i = 1; i < vetor.size(); i++) {
                if (min > vetor.get(i))
                    min = vetor.get(i);
            }
            
            double total = vetor.get(0);
            for (int i = 1; i < vetor.size(); i++) {
                
            	total = total + vetor.get(i);
            
            }
            
            double media = total / vetor.size();
    		
            txtMaior.setText(String.format("%f", max));
            txtMenor.setText(String.format("%f", min));
            txtMedia.setText(String.format("%f", media));

    	}
    	
    	else if(event.getSource() == btnCalcular) {
    		
    		int valores = Integer.parseInt(txtValores.getText());
    		ArrayList<Integer> total = new ArrayList<Integer>();
    		    
    		while(valores > 0) {
    		     total.add(valores % 100);
    		     valores /= 100;
    		}
    		
    		int total1 = total.get(0);
            for (int i = 1; i < total.size(); i++) {
                
            	total1 = total1 + total.get(i);
            
            }
            
            int total1 = total.get(0);
            for (int i = 1; i < total.size(); i++) {
                
            	total1 = total1 * total.get(i);
            
            }
            
            lblResultado.setText(String.format("Soma = %d", total1));
    		
    		}   
    		
    	}
	
    public static void main(String args[]) {
        
    	Frame_Grid janela = new Frame_Grid();
    	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    }
	
}
