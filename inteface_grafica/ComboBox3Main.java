package inteface_grafica;
import javax.swing.JFrame;

public class ComboBox3Main {

    public static void main(String[] args) {
    	ComboBox3 j = new ComboBox3("UF e Cidade");
       j.setVisible(true);
       j.setSize(400,100);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
