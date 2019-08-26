package Numeros;

/**
 *
 * @author Carlos
 */
public class Numeros {

    public static void main(String[] args) {
        int x = 13;
        int y = 0;
        int z = 0;
        
        z = x % 2;
        
        while (y != 1) {
            z = x % 2;
            if (z == 0) {
                y = x / 2;
                System.out.println(y);
                x = y;
            }else {
                y = 3 * x + 1;
                System.out.println(y);
                x = y;
            }
        }
    }    
}