package exercicio;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversorMoeda extends JFrame implements ActionListener {

	private JLabel lblValor, lblResultado;
    private JTextField txtFieldValor;
    private JCheckBox cbDolar, cbEuro, cbLibra;
    private JButton btnConverter;

    public ConversorMoeda() {
        
        JFrame janela = new JFrame("Conversor de Moeda");
		JPanel painel = new JPanel();
       
		janela.add(painel);
		painel.setLayout(new GridLayout(4, 2));

        lblValor = new JLabel("Digite o valor em Real:");
        lblResultado = new JLabel("Resultado");
        
        txtFieldValor = new JTextField();
       
        cbDolar = new JCheckBox("Dólar");
        cbEuro = new JCheckBox("Euro");
        cbLibra = new JCheckBox("Libra Esterlina");
        
        btnConverter = new JButton("Converter");
        btnConverter.addActionListener(this);
        
        painel.add(lblValor);
        painel.add(txtFieldValor);
        painel.add(cbDolar);
        painel.add(cbEuro);
        painel.add(cbLibra);
        painel.add(btnConverter);
        painel.add(lblResultado);

        janela.setLocation(500, 300);
		janela.pack();
		janela.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent event) {
        
    	double valorReal = Double.parseDouble(txtFieldValor.getText());

    	if (cbDolar.isSelected() && cbLibra.isSelected() == false && cbEuro.isSelected() == false) {
            
    		double valorDolar = valorReal * 0.18;
            lblResultado.setText(String.format("Valor em Dólar: %.2f", valorDolar));
        
    	}

        else if (cbEuro.isSelected() && cbLibra.isSelected() == false && cbDolar.isSelected() == false) {
            
        	double valorEuro = valorReal * 0.15; 
        	lblResultado.setText(String.format("Valor em Euro: %.2f", valorEuro));
        
        }

        else if (cbLibra.isSelected() && cbDolar.isSelected() == false && cbEuro.isSelected() == false) {
            
        	double valorLibra = valorReal * 0.13; 
        	lblResultado.setText(String.format("Valor em Libra Esterlina: %.2f", valorLibra));
        
        }
    	
        else if (cbDolar.isSelected() == false && cbLibra.isSelected() == false && cbEuro.isSelected() == false) {
        	
        	lblResultado.setText(String.format("Por favor selecione uma Check Box!!"));
        	
        }
    	
        else {
        	
        	lblResultado.setText(String.format("Por favor selecione apenas uma Check Box!!"));
        	
        }
        
    }

    public static void main(String args[]) {
        
    	ConversorMoeda janela = new ConversorMoeda();
    	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    }
    
}
