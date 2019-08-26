package Exec03;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Exec03 {

    public static void main(String[] args) {
        int dias;
        int idade;
        String x = JOptionPane.showInputDialog(null,"Digité sua idade:");
        
        idade = Integer.parseInt(x);
        dias = idade * 365;
        
        JOptionPane.showMessageDialog(null,"Sua idade em dias é: " + dias);
    }    
}