package Numeros;

/**
 *
 * @author Carlos
 */
public class Multplos {

    public static void main(String[] args) {
        int a = 0;
        
        while (a <= 100) {
            if ((a % 3) == 0) {
                System.out.println(a);
            }
            
            a = a + 1;
        }
    }    
}