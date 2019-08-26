package Exec_Y002;

/**
 *
 * @author Carlos
 */
import javax.swing.*;

public class Exec_Y002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double o,v,f,vMensal,minFinal;
        double Saldo = 50;
        double sAtual = 0;
        double minInicial = 100;
        double bonus = 50;
        
        while((minInicial < 0) && (bonus < 0 )){
            String x = JOptionPane.showInputDialog(null,"O = Outras operadoras"
                    + "\nV = Vai-Logo"
                    + "\nF = Telefone Fixo"
                    + "Digite uma letra para determinada ligação:" );
            String l = JOptionPane.showInputDialog(null,"Digite a duração da ligação(em minutos):");
            double lig = Double.parseDouble(l);
            
            if(("O".equals(x)) || ("o".equals(x))){
                minFinal = minInicial - lig;
                sAtual = 0.65 * lig ;
                Saldo = Saldo - sAtual;
            }
            if(("v".equals(x)) || ("V".equals(x))){    
                if (bonus > 0){
                    bonus = bonus - lig;
                }
                if (bonus < 0){
                    minFinal = minInicial - lig;
                    sAtual = 0.20 * lig;
                    Saldo = Saldo - sAtual;
                }
            }
            JOptionPane.showMessageDialog(null,"Seu saldo é de :" + Saldo);
        }
    }
    
}