package Carro;

/**
 *
 * @author Carlos
 */
public class Carro {
    String cor;
    String modelo;
    int marcha;
    float velocidadeAtual;
    
    void liga(){
        marcha = 0;
        System.out.println("O carro está ligado");
    }
    
    void trocaMarcha(){
        marcha = marcha + 1;
        velocidadeAtual = velocidadeAtual + 20;
        System.out.println("A marcha está: " + marcha);
        System.out.println("A velocidade atual é: " + velocidadeAtual);
    }
}