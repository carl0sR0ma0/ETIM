package Exec_Y001;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Exec_Y001 {

    public static void main(String[] args) {
        int QtdHr;
        int SlrHr;
        int NumDep;
        double INSS;
        double IR = 0;
      
        String x = JOptionPane.showInputDialog(null,"Digite a Quantidade de Horas:");
        String y = JOptionPane.showInputDialog(null,"Digite o Salário por Hora:");
        String z = JOptionPane.showInputDialog(null,"Digite o Númeri de Dependendtes:");
        
        QtdHr = Integer.parseInt(x);
        SlrHr = Integer.parseInt(y);
        NumDep = Integer.parseInt(z);
        
        int SlrBrt = QtdHr * SlrHr + (50 * NumDep);
        
        if (SlrBrt <= 1000) {
            INSS = SlrBrt * (8.5/100.0);
        }else{
            INSS = SlrBrt * (9.0/100.0);
        }
        
        if (SlrBrt <= 500){
            IR = 0;
        }
        
        if (SlrBrt > 500 && SlrBrt <= 1000){
            IR = SlrBrt * (5.0/100.0);
        }
        if (SlrBrt > 1000){
            IR = SlrBrt * (7.0 / 100.0);
        }        
        
        Double SlrLiq = SlrBrt - INSS - IR;
        
        JOptionPane.showMessageDialog(null,"O Salário Bruto é: "+ SlrBrt);
        JOptionPane.showMessageDialog(null,"O Desconto do INSS é: "+ INSS);
        JOptionPane.showMessageDialog(null,"O Desconto do IR é:"+ IR);
        JOptionPane.showMessageDialog(null,"O Salário Líquido é: " + SlrLiq);
    } 
}