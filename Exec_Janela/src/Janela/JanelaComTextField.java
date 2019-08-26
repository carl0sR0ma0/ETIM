package Janela;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Carlos
 */
public class JanelaComTextField {

    public static void main(String[] args) {
        Frame formulario = new Frame();
        formulario.setTitle("Teste Com TextField");
        formulario.setSize(400,400);
        formulario.setLayout(new FlowLayout());
        formulario.setLocationRelativeTo(null);
        formulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        Label lblNumero1 = new Label("Número 1:", Label.RIGHT);
        TextField tfNumero1 = new TextField(10);
        
        Label lblNumero2 = new Label("Número 2:", Label.RIGHT);
        TextField tfNumero2 = new TextField(10);
        
        Label lblSoma = new Label("Resultado :", Label.RIGHT);
        
        Button btnSoma = new Button("+");
        Button btnSubtrair = new Button("-");
        Button btnMultiplicar = new Button("*");
        Button btnDividir = new Button("/");
        
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1 = tfNumero1.getText();
                String n2 = tfNumero2.getText();
                
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int soma = a + b;
                
                String dado = "Soma é:" + soma;
                lblSoma.setText(dado);
            }
        });
        
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1 = tfNumero1.getText();
                String n2 = tfNumero2.getText();
                
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int sub = a - b;
                
                String dado = "A Diferença é:" + sub;
                lblSoma.setText(dado);
            }
        });
        
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1 = tfNumero1.getText();
                String n2 = tfNumero2.getText();
                
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int mul = a * b;
                
                String dado = "O Produto é:" + mul;
                lblSoma.setText(dado);
            }
        });
        
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1 = tfNumero1.getText();
                String n2 = tfNumero2.getText();
                
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int div = a / b;
                
                String dado = "A Divisão é:" + div;
                lblSoma.setText(dado);
            }
        });
        
        formulario.add(lblNumero1);
        formulario.add(tfNumero1);
        formulario.add(lblNumero2);
        formulario.add(tfNumero2);
        formulario.add(btnSoma);
        formulario.add(btnSubtrair);
        formulario.add(btnMultiplicar);
        formulario.add(btnDividir);
        formulario.add(lblSoma);
        formulario.setVisible(true);
    }   
}