package Numeros;

/**
 *
 * @author Carlos
 */
public class Soma_1000 {

    public static void main(String[] args) {
        int x = 0;
        int s = 0;
        
        while (x <= 1000) {
            System.out.println(s);
            x = x + 1;
            s = s + x;
        }
    }    
}