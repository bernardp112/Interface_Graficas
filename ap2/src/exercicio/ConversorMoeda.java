package exercicio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConversorMoeda extends JFrame implements ActionListener {
    private JLabel valorLabel, resultadoLabel;
    private JTextField valorTextField;
    private JCheckBox dolarCheckBox, euroCheckBox, libraCheckBox;
    private JButton converterButton;

    public ConversorMoeda() {
        super("Conversor de Moeda");

        Container container = getContentPane();
        container.setLayout(new GridLayout(4, 2));

        valorLabel = new JLabel("Digite o valor em Real:");
        container.add(valorLabel);

        valorTextField = new JTextField();
        container.add(valorTextField);

        dolarCheckBox = new JCheckBox("Dólar");
        container.add(dolarCheckBox);

        euroCheckBox = new JCheckBox("Euro");
        container.add(euroCheckBox);

        libraCheckBox = new JCheckBox("Libra Esterlina");
        container.add(libraCheckBox);

        converterButton = new JButton("Converter");
        converterButton.addActionListener(this);
        container.add(converterButton);

        resultadoLabel = new JLabel("Resultado");
        container.add(resultadoLabel);

        setSize(400, 150);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent event) {
        double valorReal = Double.parseDouble(valorTextField.getText());

        if (dolarCheckBox.isSelected()) {
            double valorDolar = valorReal * 0.18;
            resultadoLabel.setText(String.format("Valor em Dólar: %.2f", valorDolar));
        }

        if (euroCheckBox.isSelected()) {
            
        	double valorEuro = valorReal * 0.15; 
            resultadoLabel.setText(String.format("Valor em Euro: %.2f", valorEuro));
        
        }

        if (libraCheckBox.isSelected()) {
            
        	double valorLibra = valorReal * 0.13; 
            resultadoLabel.setText(String.format("Valor em Libra Esterlina: %.2f", valorLibra));
        
        }
    }

    public static void main(String args[]) {
        
    	ConversorMoeda aplicacao = new ConversorMoeda();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}