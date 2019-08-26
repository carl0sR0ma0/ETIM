package Porta;

/**
 *
 * @author Carlos
 */
public class Porta {
    String estado;
    String cor;
    float dimX, dimY, dimZ;
    
    void Abre() {
        estado = "Aberta";
    }
    
    void Fecha(){
        estado = "Fechada";
    }
    
    void Pinta(){
        cor = "Rosa";
    }
    
    void EstadoPorta(){
        if (estado == "Aberta"){
            System.out.println("A porta está:" + estado);
        }else{
            System.out.println("A porta está:" + estado);
        }
    }
}