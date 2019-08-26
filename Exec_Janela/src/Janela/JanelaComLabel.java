package Janela;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Carlos
 */
public class JanelaComLabel {

    public static void main(String[] args) {
        Frame formulario = new Frame();
        formulario.setTitle("Teste de Formulário");
        formulario.setSize(400,400);
        formulario.setLayout(new FlowLayout());
        formulario.setLocationRelativeTo(null);
        formulario.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        Label teste001 = new Label();
        teste001.setText("Teste de Label 001");
        teste001.setAlignment(Label.CENTER);
        teste001.setBackground(Color.blue);
        teste001.setForeground(Color.yellow);
        
        formulario.add(teste001);
        formulario.setVisible(true);
    }  
}