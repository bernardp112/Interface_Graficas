package inteface_grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuEvento1 extends JFrame{

    private JMenuItem abrir, novo, salvar, sair;
    private JMenuItem copiar, colar, recortar;
    private JMenuItem ajuda, sobreApl;
  
    private JMenu arquivo, editar, sobre;

    private JMenuBar menuBar;

    private JPanel p;
    

public MenuEvento1(String entrada){

    setSize(400, 400);
    setLocation(300, 200);

    // construindo objetos

    p = new JPanel();
    this.add(p);
    
    arquivo = new JMenu("Arquivo");
    editar = new JMenu("Editar");
    sobre = new JMenu("Sobre");

    arquivo.setMnemonic('A');
    sobre.setMnemonic('B');

    abrir = new JMenuItem("Abrir");
    novo = new JMenuItem("Novo");
    salvar = new JMenuItem("Salvar");
    sair = new JMenuItem("Sair");
   
    abrir.setMnemonic('A');

    copiar = new JMenuItem("Copiar");
    colar = new JMenuItem("Colar");
    recortar = new JMenuItem("Recortar");
    
    ajuda = new JMenuItem("Ajuda");
    sobreApl = new JMenuItem("Sobre Aplicação");
    
    sobreApl.setMnemonic('B');

    // construindo menu arquivo
    arquivo.add ( abrir );
    arquivo.add ( novo );
    arquivo.add ( salvar );
    arquivo.addSeparator();
    arquivo.add ( sair );

    // construindo menu editar
    editar.add ( copiar );
    editar.add ( colar );
    editar.add ( recortar );

    // construindo menu sobre
    sobre.add ( ajuda );
    sobre.addSeparator();
    sobre.add ( sobreApl );
    
    // construindo menu
    menuBar = new JMenuBar();
    menuBar.add( arquivo );
    menuBar.add( editar );
    menuBar.add( sobre );

    setJMenuBar( menuBar );

    Ouvinte ouvinte = new Ouvinte();

    sair.addActionListener(ouvinte);
    abrir.addActionListener(ouvinte);

}

private class Ouvinte implements ActionListener{

    public void actionPerformed (ActionEvent e){
       
    	Object obj = e.getSource();

       if (obj == sair){
           
    	   JOptionPane.showMessageDialog(null,"Testando ... Fechando a aplicação.");
           System.exit(0);
           
       }
       else
          if (obj == abrir)
              JOptionPane.showMessageDialog(null,"Abrindo arquivo ...");

    } //fim do método actionPerformed

}  //fim da classe Ouvinte

} //fim da classe