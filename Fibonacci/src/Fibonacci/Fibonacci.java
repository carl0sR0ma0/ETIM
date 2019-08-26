package Fibonacci;

/**
 *
 * @author Carlos
 */
public class Fibonacci {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        int b = 0;
        
        while (b <= 100) {
            x = x + y;
            y = b;
            b = x;
            System.out.println(b);
        }
    }    
}