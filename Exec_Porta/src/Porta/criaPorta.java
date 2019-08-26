package Porta;

/**
 *
 * @author Carlos
 */
public class criaPorta {

    public static void main(String[] args) {
        Porta prt = new Porta();
        
        prt.Abre();
        prt.Fecha();
        prt.cor = "Marrom";
        prt.dimX = 030;
        prt.dimY = 2;
        prt.dimZ = 5;
        prt.EstadoPorta();
    }    
}