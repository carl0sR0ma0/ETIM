package Carro;

/**
 *
 * @author Carlos
 */
public class criaCarro {

    public static void main(String[] args) {
        Carro car = new Carro();
        
        car.modelo = "limousine";
        car.cor = "branco";
        car.liga();
        car.trocaMarcha();
        car.trocaMarcha();
    }    
}