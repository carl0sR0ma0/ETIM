package Exec04;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Exec04 {

    public static void main(String[] args) {
        int salario;
        int reajuste;
        int reajusteFinal;
        String s = JOptionPane.showInputDialog("Digité o seu salário:");
        String r = JOptionPane.showInputDialog("Digité a porcentagem do seu Reajuste:");
        
        salario = Integer.parseInt(s);
        reajuste = Integer.parseInt(r);
        
        reajusteFinal = (salario * reajuste) / 100;
        salario = salario + reajusteFinal;
        
        JOptionPane.showMessageDialog(null,"O Salário Final com Reajuste é: " + salario);
    }    
}