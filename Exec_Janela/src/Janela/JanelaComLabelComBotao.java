package Janela;

import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
/**
 *
 * @author Carlos
 */
public class JanelaComLabelComBotao {

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
        
        Button botao = new Button();
        botao.setLabel("Clique-me");
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                teste001.setText("O botão foi clicado!!!");
            }
        });
        
        formulario.add(teste001);
        formulario.add(botao);
        formulario.setVisible(true);
    }    
}