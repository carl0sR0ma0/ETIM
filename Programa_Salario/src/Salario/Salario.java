package Salario;

import javax.swing.*;
/**
 *
 * @author Carlos
 */
public class Salario {

    public static void main(String[] args) {
        int hora,sHora,nDependentes;
        double sBruto,inss = 0,ir = 0;
        
        String h = JOptionPane.showInputDialog(null,"***Programa Salario****"
            + "\nDigite o seu salario por horas:");
        String sH = JOptionPane.showInputDialog(null,"Digite sua carga horaria");
        String nD = JOptionPane.showInputDialog(null,"Digite o numero de dependentes");
        sHora = Integer.parseInt(sH);
        hora = Integer.parseInt(h);
        nDependentes = Integer.parseInt(nD);
        
        sBruto = hora * sHora +(50 * nDependentes);
        
        if(sBruto <= 1000){
            inss = sBruto * 8.5/100;
        }
        if(sBruto > 1000){
            inss = sBruto * 9/100;
        }
        if(sBruto <= 500){
            ir = 0;
        }
        if((sBruto > 500) && (sBruto <= 1000)){
            ir = sBruto * 5/100;
        }
        if(sBruto > 1000){
            ir = sBruto * 7/100;
        }
        double sLiquido = sBruto - inss - ir;
        
        JOptionPane.showMessageDialog(null, "Salário Bruto: R$" + sBruto
                + "\nINSS: R$" + inss
                + "\nIR: R$" + ir
                + "\nSalário Liquido: R$" + sLiquido);
    }    
}