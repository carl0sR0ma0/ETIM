package Teste;

/**
 *
 * @author Carlos
 */
public class Misterio1 {

    public static void main(String[] args) {
        int contador = 1;
        
        while(contador <=10){
            if((contador%2) == 1){
                System.out.println("Saudosa");
            }
            else{
                System.out.println("Maloca");
            }
            contador++;
        }
    }    
}