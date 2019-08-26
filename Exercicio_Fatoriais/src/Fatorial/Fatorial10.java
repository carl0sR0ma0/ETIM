package Fatorial;

/**
 *
 * @author Carlos
 */
public class Fatorial10 {

    public static void main(String[] args) {
        int x = 1;
        int y =1;
        
        while (x <= 10) {
            System.out.println(y);
            x = x + 1;
            y = y * x;
        }
    }    
}