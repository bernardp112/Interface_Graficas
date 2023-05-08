package inteface_grafica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ComboBox4 extends JFrame implements ActionListener, ItemListener {

    private JPanel painelEntrada, painelSenha;
    private JComboBox cbEstado;
    private JTextField txtMatricula;
    private JPasswordField senha;
    private JLabel lblSenha, lblEstado;
    private JButton btnEntrar, btnOk, btnLimparSenha;
    private static String digitado = "";
    private static final String senhaCorreta = "java";

    public ComboBox4(String str) {
    	
        String estados[] = {"RJ", "SP", "ES", "MG"};

        ////////////////////////////////////////////////////////////////////////
        //             Painel de entrada - magenta

        painelEntrada = new JPanel(new FlowLayout());  //cria o painel de entrada
        add(painelEntrada);                            //adiciona o painel à janela

        //cria os componentes
        cbEstado = new JComboBox(estados);
        txtMatricula = new JTextField(10);
        btnEntrar = new JButton("Entrar");
        lblEstado = new JLabel("");

        //adiciona componentes ao painel de entrada
        painelEntrada.add(new JLabel("Matrícula:"));
        painelEntrada.add(txtMatricula);

        painelEntrada.add(new JLabel("Estado:"));
        painelEntrada.add(cbEstado);
        painelEntrada.add(btnEntrar);
        painelEntrada.add(lblEstado);   //lblEstado abrigará o ícone

        painelEntrada.setBackground(Color.green);  //define a cor de fundo do painel
        painelEntrada.setVisible(true);              //torna o painel visível

        //para não mostrar inicialmente o 1o. item do combo
        cbEstado.setEditable(true);
        cbEstado.setSelectedItem("");
        cbEstado.setEditable(false);

         ////////////////////////////////////////////////////////////////////////
        //                     Painel de senha - amarelo

        painelSenha = new JPanel(new FlowLayout()); //cria o painel de senha

        //cria componentes
        lblSenha = new JLabel("Digite a senha: ");
        senha = new JPasswordField(10);
        btnOk = new JButton("OK");
        btnLimparSenha = new JButton("Limpar");

        //adiciona os componentes ao painle painelSenha
        painelSenha.add(lblSenha);
        painelSenha.add(senha);
        painelSenha.add(btnOk);
        painelSenha.add(btnLimparSenha);

        painelSenha.setBackground(Color.YELLOW); //define a cor de fundo como amarelo
        painelSenha.setVisible(false); //torna o painel não visível

        //////// ///////////////////////////////////////////////////////////////
        //  Eventos... Associando as fontes do evento aos ouvintes dos eventos

        btnEntrar.addActionListener(this);
        btnOk.addActionListener(this);
        btnLimparSenha.addActionListener(this);

        cbEstado.addItemListener(this);

        ///////////////////////////////////////////////////////////////////////

    } //fim construtor

    public void actionPerformed(ActionEvent e) {
    	
        Object obj = e.getSource();

        if (obj == btnEntrar) {
        	
            add(painelSenha);               //adiciona o painel da senha à janela
            painelSenha.setVisible(true);   //faz o painel da senha ficar visível
            painelEntrada.setVisible(false); //faz o painel de entrada ficar não visível

        } 
        
        else if (obj == btnOk) {

            String senhaDigitada = new String(senha.getPassword()); //pega a senha
            
            if (senhaCorreta.equals(senhaDigitada)) {
            	
                JOptionPane.showMessageDialog(null, "Senha correta.");
                
                // Este for tem apenas o objetivo de testar métodos vistos 
                
                for (int i = 0; i < cbEstado.getItemCount(); i++) {
                	
                    JOptionPane.showMessageDialog(null, "Bem-vindo " + cbEstado.getItemAt(i) + " ! ");
                    
                }

            } 
            
            else {
            	
                JOptionPane.showMessageDialog(null, "Senha incorreta");
                
            }

        } 
        
        else if (obj == btnLimparSenha) {
        	
            senha.setText("");
            
        }

    } //fim do método actionPerformed

    public void itemStateChanged(ItemEvent e) {
    	
        ImageIcon i;

        if (e.getStateChange() == ItemEvent.SELECTED) {
        	
            if (cbEstado.getSelectedItem() == "RJ") {
            	
                i = new ImageIcon(getClass().getResource("/Downloads/imagens/Rio.png"));
                lblEstado.setIcon(i);
                
            }
            
            else
                if (cbEstado.getSelectedItem() == "SP"){
                	
                   i = new ImageIcon(getClass().getResource("/Downloads/imagens/SP.png"));
                   lblEstado.setIcon(i);
                   
                }

        } //fim do primeiro if

    } //fim método itemStateChanged
    
} //fim classe
