package inteface_grafica;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox3 extends JFrame {
    
    private JPanel p;
    private JComboBox cbbUF;
    private JComboBox cbbCidade;
    
    private TrataUF tratador;
    
    private String[] UF = { "- Selecione uma UF -", "RJ", "SP", "MG" };
    
    private String[][] cidades = {
        null,
        { "Rio de Janeiro", "Niteroi", "Duque de Caxias", "Volta Redonda" },
        { "São Paulo", "Campinas", "Ribeirão Preto", "Sorocaba" },
        { "Belo Horiozonte", "Betim", "Juiz de Fora", "Alem Paraíba" }
    };
    
    public ComboBox3(String t){
        super(t);
               
        cbbUF = new JComboBox(UF);
        cbbCidade = new JComboBox();
        
        p = new JPanel(new FlowLayout());
        add(p);
        
        p.add(new JLabel("UF:"));
        p.add(cbbUF);
                
        p.add(new JLabel("Cidade:"));
        p.add(cbbCidade);

        //Evento
        tratador = new TrataUF();
        cbbUF.addItemListener(tratador); 
        
    }
    
    private class TrataUF implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            
            if (e.getStateChange() == ItemEvent.SELECTED) {
                
                System.out.println("Marcou " + ((JComboBox)(e.getSource())).getSelectedIndex());
                int index = cbbUF.getSelectedIndex();
                
                cbbCidade.removeAllItems();
                
                if (index == 0) {
                	
                    cbbCidade.setEnabled(false);
                    
                }
                
                else {
                
                    cbbCidade.setEnabled(true);
                    
                  // Este é o for each ... Para cada String c em cidades[index] 
                  // Este for pode ser escrito da forma tradicional mais abaixo :
                  //  for (String c : cidades[index])
                  //      cbbCidade.addItem(c);
                    
                    for(int i = 0; i < cidades[index].length; i++)
                    {
                           String c = cidades[index][i];
                           cbbCidade.addItem(c);
                           
                    }
                    
                }
                
            }  //fim do 1o. if
            
        }  //fim do método
        
    } //fim da classe
    
}