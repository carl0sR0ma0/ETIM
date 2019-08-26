package Exec09;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Exec09 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        
        //* Aqui está atribuindo o método InputDialog do JOptionPane nas variáveis d,e,f 
        String d = JOptionPane.showInputDialog(null,"Digité o primeiro númeru:");
        String e = JOptionPane.showInputDialog(null,"Digité o segundo númeru:");
        String f = JOptionPane.showInputDialog(null,"Digité o terceiro númeru:");
        
        //* Agora vamos atribuir os valores digitados nas variáveis d,e,f para as variáveis a.b.c
        a = Integer.parseInt(d);
        b = Integer.parseInt(e);
        c = Integer.parseInt(f);
        
        //* Vamos comparar os números para verem quem é o maior
        if ((a > b) || (a > c)) {
            JOptionPane.showMessageDialog(null,a);
        }
        if ((b < a) || (b > c)) {
            JOptionPane.showMessageDialog(null,b);
        }
        if ((c < a) && (c < b)){
            JOptionPane.showMessageDialog(null,c);
        }
    }    
}