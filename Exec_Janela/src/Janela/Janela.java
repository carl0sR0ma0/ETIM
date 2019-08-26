package Janela;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Carlos
 */
public class Janela {

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
        formulario.setVisible(true);
    }    
}