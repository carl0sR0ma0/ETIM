package MudalLabel;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Carlos
 */
public class MudaLabel {

    public static void main(String[] args) {
        Frame formulario = new Frame(); //Cria a Janela
        formulario.setTitle("FORA PATRICIA"); //Dá o titulo na Janela
        formulario.setSize(400,400); //Define o Tamanho da Janela
        formulario.setLayout(new FlowLayout());
        formulario.setLocationRelativeTo(null);
        formulario.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        Label teste001 = new Label();
        teste001.setText("Fora Patricia");
        teste001.setAlignment(Label.CENTER);
        teste001.setBackground(Color.blue);
        teste001.setForeground(Color.yellow);
        Font fonte = new Font("Serif", Font.PLAIN,24);
        Font fonte2 = new Font("Serif", Font.PLAIN,15);
        teste001.setFont(fonte);
        
        Button botao = new Button();
        botao.setLabel("Clique-me para Mandar A PATRICIA embora");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                teste001.setText("TCHAU PATRICIA!!!");
                teste001.setFont(fonte2);
            }
        });
        
        formulario.add(teste001);
        formulario.add(botao);
        formulario.setVisible(true); //Mostra a Janela
    }    
}